package com.laziv.lesson8.task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 2
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num % 1 == 0) {
            if (num % 2 == 0)
                System.out.println("The number is even");
            else
                System.out.println("The number is odd");
        } else {
            System.out.println("The number is not an integer");
        }


        //Task 3

        System.out.println("Enter the first integer");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second integer");
        double num2 = scanner.nextDouble();
        if (num1 % 1 == 0 && num2 % 1 == 0) {
            System.out.println("sum = " + (int) (num1 + num2));
        } else {
            System.out.println("One or both numbers is not an integer");
        }

    }

}