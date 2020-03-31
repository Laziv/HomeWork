package com.laziv.lesson14.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfSelect;

        while (true){
            System.out.println("\n• Введіть 1 щоб додати товар\n" +
                                 "• Введіть 2 щоб видалити товар\n" +
                                 "• Введіть 3 щоб замінити товар\n" +
                                 "• Введіть 4 щоб сортувати за назвоню\n" +
                                 "• Введіть 5 щоб сортувати за довжиною\n" +
                                 "• Введіть 6 щоб сортувати за шириною\n" +
                                 "• Введіть 7 щоб сортувати за вагою\n" +
                                 "• Введіть 8 щоб вивести і-тий елемент колекції\n" +
                                 "• Введіть 0 щоб Вийти з програми");

            try {
                numOfSelect = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Потрібно ввести число");
                continue;
            }
            switch (numOfSelect){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    shop.addCommodity();
                    break;
                case 2:
                    shop.removeCommodity();
                    break;
                case 3:
                    shop.changeCommodity();
                    break;
                case 4:
                    shop.sortByName();
                    break;
                case 5:
                    shop.sortByLength();
                    break;
                case 6:
                    shop.sortByWidth();
                    break;
                case 7:
                    shop.sortByWeight();
                    break;
                case 8:
                    shop.printCommodity();
                    break;
                default:
                    System.out.println("Потрібно ввести число від 0 до 8");

            }
        }
    }
}
