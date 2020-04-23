package com.laziv.lesson23.task1;

import java.util.*;

public class Faction {
    private String name;
    private List<Deputy> listOfDeputies = new ArrayList();
    private Scanner scanner = new Scanner(System.in);


    public Faction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addDeputy() {
        System.out.println("Введіть ім'я депутата");
        String firstName = scanner.next();

        System.out.println("Введіть прізвище депутата");
        String lastName = scanner.next();

        Deputy deputy = new Deputy(getRandomNum(25, 100), getRandomNum(50, 150), firstName, lastName, getRandomNum(0, 1) == 1 ? true : false);
        deputy.giveBride();

        listOfDeputies.add(deputy);
        System.out.println("Депутат " + lastName + " " + firstName + " добавлений\n");

    }

    public void removeDeputy() {
        System.out.println("Введіть ім'я депутата");
        String firstName = scanner.next();

        System.out.println("Введіть прізвище депутата");
        String lastName = scanner.next();

        Optional<Deputy> optionalDeputy = listOfDeputies.stream()
                .filter(x -> x.getFirstName().equalsIgnoreCase(firstName) && x.getLastName().equalsIgnoreCase(lastName))
                .findFirst();

        if (optionalDeputy.isPresent()) {
            listOfDeputies.remove(optionalDeputy.get());
            System.out.println("Депутата " + lastName + " " + firstName + " видалено");
        } else {
            System.out.println("Депутата " + lastName + " " + firstName + " не знайдено");
        }
    }

    public void printBribeTakers() {
        if (isNotEmpty()){
            System.out.println("Список хабарників:");

            long count = listOfDeputies.stream().filter(Deputy::isBribeTaker)
                    .peek(deputy -> System.out.println(deputy.getLastName() + " " + deputy.getFirstName()))
                    .count();

            if (count == 0){
                System.out.println("Хабарнеків немає");
            }
        }
    }

    public void printBiggestBribeTaker() {
        if (isNotEmpty()) {
            Deputy deputy = listOfDeputies.stream().max(Comparator.comparingInt(Deputy::getSizeOfBribe)).get();
            System.out.println("Найбільший хабарник - " + deputy.getLastName() + " " + deputy.getFirstName() +
                                ", розмір хабаря " + deputy.getSizeOfBribe());
        }
    }

    public void printAllDeputies() {
        if (isNotEmpty()){
            listOfDeputies.stream().forEach(System.out::println);
        }
    }
    public void removeAllDeputies() {
        listOfDeputies.clear();
        System.out.println("Всіх депутатів видалено");
    }

    private boolean isNotEmpty(){
        if (!listOfDeputies.isEmpty()){
            return true;
        }
        else {
            System.out.println("Депутатів немає");
            return false;
        }
    }

    private static int getRandomNum(int min, int max) {
        return (int) (Math.random() * ( ++max - min)) + min;
    }

}
