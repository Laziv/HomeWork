package com.laziv.lesson20;

import java.util.Scanner;

public class RunnableThread implements Runnable{
    private int amount;

    public RunnableThread(int amount) {
        this.amount = amount;
    }

    @Override
    public void run() {
        long num1 = 1;
        long num2 = 1;
        long[] nums = new long[amount];

        for (int i = 0; i < amount; i++) {
            if (i < 2){
                nums[i] = num1;
            }else {
                long result = num1 + num2;
                nums[i] = result;
                num1 = num2;
                num2 = result;
            }
        }

        System.out.print("\nПотік Runnable: ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
