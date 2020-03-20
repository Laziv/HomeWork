package com.laziv.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        Integer[] arrayRandomNumbers = new Integer[20];

        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            arrayRandomNumbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Масив до сортування  " + Arrays.toString(arrayRandomNumbers));

        for (int i = 1; i < arrayRandomNumbers.length; i++) {
            for (int j = i - 1; j >= 0 && arrayRandomNumbers[j + 1] < arrayRandomNumbers[j]; j--) {
                int temp = arrayRandomNumbers[j + 1];
                arrayRandomNumbers[j + 1] = arrayRandomNumbers[j];
                arrayRandomNumbers[j] = temp;
            }
        }
        System.out.println("Відсортований масив в порядку зростання " + Arrays.toString(arrayRandomNumbers));

        for (int i = 1; i < arrayRandomNumbers.length; i++) {
            for (int j = i - 1; j >= 0 && arrayRandomNumbers[j + 1] > arrayRandomNumbers[j]; j--) {
                int temp = arrayRandomNumbers[j + 1];
                arrayRandomNumbers[j + 1] = arrayRandomNumbers[j];
                arrayRandomNumbers[j] = temp;
            }
        }
        System.out.println("Відсортований масив в порядку спадання " + Arrays.toString(arrayRandomNumbers));


        //Task2
        System.out.println("\nTask2\n");

        Car[][] arrayCars = new Car[getRandomNum(5, 10)][getRandomNum(1, 3)];
        String[] arrayCarNames = {"Toyota", "Honda", "Lexus", "Mazda", "Nissan", "Mercedes-Benz", "BMW", "Audi"};
        String[] arraySteeringWheelMaterials = {"Alcantara", "Eco leather", "Suede"};

        for (int i = 0; i < arrayCars.length; i++) {
            for (int j = 0; j < arrayCars[i].length; j++) {
                int yearOfProduction = getRandomNum(1950, 2020);
                int amountOfHorsepower = getRandomNum(100, 1500);
                int amountOfCylinders = getRandomEvenNum(4, 16);
                int diameter = getRandomNum(15, 50);
                String carName = arrayCarNames[getRandomNum(0, arrayCarNames.length)];
                String steeringWheelMaterial = arraySteeringWheelMaterials[getRandomNum(0, arraySteeringWheelMaterials.length)];

                SteeringWheel steeringWheel = new SteeringWheel(diameter, steeringWheelMaterial);
                Engine engine = new Engine(amountOfCylinders);

                arrayCars[i][j] = new Car(amountOfHorsepower, yearOfProduction, carName, engine, steeringWheel);
            }
        }


        System.out.println("1) Вивести toString() даних елементів масиву на консоль.");
        System.out.println("2) Для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто");

        int numOfSelect = 0;
        do {
            System.out.println("Введіть 1 або 2");
            try {
                numOfSelect = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            } catch (NumberFormatException | IOException e) {
                continue;
            }
        } while (numOfSelect != 1 && numOfSelect != 2);


        if (numOfSelect == 1){
            for (Car[] cars : arrayCars){
                System.out.println(Arrays.deepToString(cars));
            }
        }
        else {
            for (Car[] cars : arrayCars){
                Arrays.fill(cars, arrayCars[0][0]);
            }

            for (Car[] cars : arrayCars){
                System.out.println(Arrays.deepToString(cars));
            }
        }
    }


    public static int getRandomNum(int min, int max) {
        int r = (int) (Math.random() * (max - min)) + min;
        return r;
    }

    public static int getRandomEvenNum(int min, int max) {
        while (true) {
            int r = getRandomNum(min, max);
            if (r % 2 == 0) {
                return r;
            }
        }
    }


}
