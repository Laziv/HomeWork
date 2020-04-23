package com.laziv.lesson23.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfSelect;

        while (true) {
            System.out.println("\n• Введіть 1 щоб додати учасника клубу\n" +
                                 "• Введіть 2 щоб додати тваринку до учасника клубу\n" +
                                 "• Введіть 3 щоб видалити тваринку з учасника клубу\n" +
                                 "• Введіть 4 щоб видалити учасника з клубу\n" +
                                 "• Введіть 5 щоб видалити конкретну тваринку зі всіх власників\n" +
                                 "• Введіть 6 щоб вивести на екран зооклуб\n" +
                                 "• Введіть 0 щоб вийти з програми");
            try {
                numOfSelect = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Потрібно ввести число");
                continue;
            }
            switch (numOfSelect) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    zooClub.addMember();
                    break;
                case 2:
                    zooClub.addAnimalForMember();
                    break;
                case 3:
                    zooClub.removeAnimal();
                    break;
                case 4:
                    zooClub.removeMember();
                    break;
                case 5:
                    zooClub.removeAnimalFromAllMember();
                    break;
                case 6:
                    zooClub.printClub();
                    break;
                default:
                    System.out.println("Потрібно ввести число від 0 до 6");

            }
        }
    }
}
