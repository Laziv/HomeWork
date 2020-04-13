package com.laziv.lesson20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість чисел Фібоначі");
        int n = scanner.nextInt();

        MyThread myThread = new MyThread(n);
        myThread.start();
        myThread.join();
        Thread thread = new Thread(new RunnableThread(n));
        thread.start();
        thread.join();



    }

}