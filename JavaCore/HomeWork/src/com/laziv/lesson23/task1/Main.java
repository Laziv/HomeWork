package com.laziv.lesson23.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        SupremeCouncil supremeCouncil = new SupremeCouncil();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int numOfSelect;
            System.out.println( "• Введіть 0 для виходу\n" +
                                "• Введіть 1 щоб додати фракцію\n" +
                                "• Введіть 2 щоб видалити конкретну фракцію\n" +
                                "• Введіть 3 щоб вивести усі  фракції\n" +
                                "• Введіть 4 щоб очистити конкретну фракцію\n" +
                                "• Введіть 5 щоб вивести конкретну фракцію\n" +
                                "• Введіть 6 щоб додати депутата в фракцію\n" +
                                "• Введіть 7 щоб видалити депутата з фракції\n" +
                                "• Введіть 8 щоб вивести список хабарників\n" +
                                "• Введіть 9 щоб вивести найбільшого хабарника");

            try {
                numOfSelect = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("\nПотрібно ввести число");
                continue;
            }

            switch (numOfSelect) {
                case 0:
                    System.exit(0);
                case 1:
                    supremeCouncil.addFaction();
                    break;
                case 2:
                    supremeCouncil.removeFaction();
                    break;
                case 3:
                    supremeCouncil.printAllFactions();
                    break;
                case 4:
                    supremeCouncil.clearFaction();
                    break;
                case 5:
                    supremeCouncil.printFaction();
                    break;
                case 6:
                    supremeCouncil.addDeputyForFaction();
                    break;
                case 7:
                    supremeCouncil.removeDeputyForFaction();
                    break;
                case 8:
                    supremeCouncil.printBribeTakersForFaction();
                    break;
                case 9:
                    supremeCouncil.printBiggestBribeTakerForFaction();
                default:
                    System.out.println("\nПотрібно ввести число від 1 до 9");
                    break;
            }
        }
    }
}
