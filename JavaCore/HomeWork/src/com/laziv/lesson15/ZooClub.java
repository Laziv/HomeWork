package com.laziv.lesson15;

import java.util.*;

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
        boolean isFound = false;
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        System.out.println("Введіть тип тварини (наприклад, кіт)");
        String animalType = scanner.next();

        System.out.println("Введіть ім'я тварини");
        String animalName = scanner.next();

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            Person person = entry.getKey();
            if (person.getName().equalsIgnoreCase(name)) {
                entry.getValue().add(new Animal(animalName, animalType));
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Тварину " + animalType + " с іменем " + animalName + " додано для учасника клубу " + name);
        } else {
            System.out.println("Учасника клубу " + name + "не найдено");
        }
    }

    public void removeAnimal() {
        boolean isRemote = false;
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        System.out.println("Введіть тип тварини (наприклад, кіт)");
        String animalType = scanner.next();

        System.out.println("Введіть ім'я тварини");
        String animalName = scanner.next();

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(name)) {
                Iterator<Animal> iterator = entry.getValue().iterator();
                while (iterator.hasNext()) {
                    Animal animal = iterator.next();
                    if (animal.getName().equalsIgnoreCase(animalName) && animal.getTypeOfAnimal().equalsIgnoreCase(animalType)) {
                        iterator.remove();
                        isRemote = true;
                        break;
                    }
                }
            }
        }

        if (isRemote) {
            System.out.println("Тварину " + animalType + " с іменем " + animalName + " видалено");
        } else {
            System.out.println("Тварину " + animalType + " с іменем " + animalName + " не найдено");
        }
    }

    public void removeMember() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        boolean isRemote = false;
        System.out.println("Введіть ім'я учасника клубу");
        String name = scanner.next();

        System.out.println("Введіть його вік");
        int age = getNumber(scanner);

        Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Person member = iterator.next().getKey();
            if (member.getName().equalsIgnoreCase(name) && age == member.getAge()) {
                iterator.remove();
                isRemote = true;
            }
        }
        if (isRemote) {
            System.out.println("Учасника клубу " + name + " видалено");
        } else {
            System.out.println("Учасника клубу " + name + " не найдено");
        }
    }

    public void removeAnimalFromAllMember() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        int count = 0;
        System.out.println("Введіть тип тварини (наприклад, кіт)");
        String animalType = scanner.next();

        System.out.println("Введіть ім'я тварини");
        String animalName = scanner.next();

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            Iterator<Animal> iterator = entry.getValue().iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                if (animal.getName().equalsIgnoreCase(animalName) && animal.getTypeOfAnimal().equalsIgnoreCase(animalType)) {
                    iterator.remove();
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Такої тварини не найдено в учасників клубу");
        } else {
            System.out.println("Видалено " + count + " тварин");
        }
    }

    public void printClub() {
        if (map.isEmpty()) {
            System.out.println("Список учасників клубу пустий");
            return;
        }

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            System.out.println("Учасник клубу, " + entry.getKey().toString());
            if (entry.getValue().isEmpty()) {
                System.out.println("Тварин немає");
            } else {
                System.out.println("Список його тварин:");
                for (Animal animal : entry.getValue()) {
                    System.out.println(animal.toString());
                }
            }
        }
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


