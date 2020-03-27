package com.laziv.lesson12.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        List<String> carNames = new ArrayList<>(Arrays.asList("Toyota", "Honda", "Lexus", "Mazda", "Nissan", "Mercedes-Benz", "BMW", "Audi"));
        List<String> steeringWheelMaterials = new ArrayList<>(Arrays.asList("Alcantara", "Eco leather", "Suede"));
        int random = getRandomNum(5, 10);

        for (int i = 0; i < random; i++) {
            String carName = carNames.get(getRandomNum(0, carNames.size()));
            String steeringWheelMaterial = steeringWheelMaterials.get(getRandomNum(0, steeringWheelMaterials.size()));

            SteeringWheel steeringWheel = new SteeringWheel(getRandomNum(15, 50), steeringWheelMaterial);
            Engine engine = new Engine(getRandomEvenNum(4, 16));

            cars.add(new Car(getRandomNum(100, 1500), getRandomNum(1950, 2020), carName, engine, steeringWheel));
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


        if (numOfSelect == 1) {
            for (Car car : cars) {
                System.out.println(car);
            }
        } else {

            for (int i = 0; i < cars.size(); i++) {
                cars.set(i, cars.get(0));
            }

            for (Car car : cars) {
                System.out.println(car);
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
