package com.laziv.lesson20;

import java.util.Arrays;
import java.util.Scanner;

public class MyThread extends Thread{
    private int amount;

    public MyThread(int amount) {
        this.amount = amount;
    }

    @Override
    public void run(){
        long num1 = 1;
        long num2 = 1;
        System.out.print("Потік Thread: ");
        for (int i = 0; i < amount; i++) {
          if (i < 2){
              System.out.print(num1 + " ");
          }else {
              long result = num1 + num2;
              System.out.print(result + " ");
              num1 = num2;
              num2 = result;
          }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
