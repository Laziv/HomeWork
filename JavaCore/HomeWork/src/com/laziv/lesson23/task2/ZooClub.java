package com.laziv.lesson23.task2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ZooClub {
    private Map<Person, List<Animal>> map = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addMember() {
        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        System.out.println("Введіть його вік");
        int age = getNumber(scanner);

        map.put(new Person(name, age), new ArrayList<Animal>());
        System.out.println("Учасника клубу " + name + " добавлено");
    }

    public void addAnimalForMember() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        Optional<Map.Entry<Person, List<Animal>>> optionalAnimals = map.entrySet().stream()
                .filter(p -> p.getKey().getName().equalsIgnoreCase(name))
                .findFirst();

        if (optionalAnimals.isPresent()) {
            System.out.println("Введіть тип тварини (наприклад, кіт)");
            String animalType = scanner.next();

            System.out.println("Введіть ім'я тварини");
            String animalName = scanner.next();

            optionalAnimals.get().getValue().add(new Animal(animalName, animalType));
            System.out.println("Тварину " + animalType + " с іменем " + animalName + " додано для учасника клубу " + name);
        } else {
            System.out.println("Учасника клубу " + name + " не знайдено");
        }
    }

    public void removeAnimal() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        Optional<Map.Entry<Person, List<Animal>>> optionalAnimals = map.entrySet().stream()
                .filter(p -> p.getKey().getName().equalsIgnoreCase(name))
                .findFirst();

        if (optionalAnimals.isPresent()) {
            System.out.println("Введіть тип тварини (наприклад, кіт)");
            String animalType = scanner.next();

            System.out.println("Введіть ім'я тварини");
            String animalName = scanner.next();

            if (optionalAnimals.get().getValue().remove(new Animal(animalName, animalType))) {
                System.out.println("Тварину " + animalType + " с іменем " + animalName + " видалено");
            } else {
                System.out.println("Тварину " + animalType + " с іменем " + animalName + " не знайдено");
            }
        } else {
            System.out.println("Учасника клубу " + name + " не знайдено");
        }
    }

    public void removeMember() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        System.out.println("Введіть його вік");
        int age = getNumber(scanner);

        if (map.remove(new Person(name, age)) != null) {
            System.out.println("Учасника клубу " + name + " видалено");
        } else {
            System.out.println("Учасника клубу " + name + " не знайдено");
        }
    }

    public void removeAnimalFromAllMember() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }
        System.out.println("Введіть тип тварини (наприклад, кіт)");
        String animalType = scanner.next();

        System.out.println("Введіть ім'я тварини");
        String animalName = scanner.next();

        map.forEach((k, v) -> {
                    if (v.remove(new Animal(animalName, animalType))){
                        System.out.println("Тварину " + animalType + " с іменем " + animalName + " видалено в учасника клубу " + k.getName());
                    }
                });
    }

    public void printClub() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }
        map.forEach((k, v) -> {
            System.out.println("Учасник клубу, " + k.toString());
            if(v.isEmpty()){
                System.out.println("Тварин немає");
            }else {
                System.out.println("Список його тварин:");
                v.forEach(System.out::println);
            }
        });
    }

    private static int getNumber(Scanner scanner) {
        while (true) {
            try {
                String str = scanner.next();
                return Integer.parseInt(str);

            } catch (NumberFormatException e) {
                System.out.println("Потрібно ввести число");
            }
        }

    }


}


