package com.laziv.lesson13;

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
        boolean isRemote = false;
        Iterator<Deputy> deputyIterator = listOfDeputies.iterator();

        System.out.println("Введіть ім'я депутата");
        String firstName = scanner.next();

        System.out.println("Введіть прізвище депутата");
        String lastName = scanner.next();

        while (deputyIterator.hasNext()) {
            Deputy deputy = deputyIterator.next();
            if (deputy.getFirstName().equalsIgnoreCase(firstName) && deputy.getLastName().equalsIgnoreCase(lastName)) {
                deputyIterator.remove();
                isRemote = true;
                break;
            }
        }
        if (isRemote) {
            System.out.println("Депутата " + lastName + " " + firstName + " видалено");
        } else {
            System.out.println("Депутата " + lastName + " " + firstName + " не найдено");
        }
    }

    public void printBribeTakers() {
        if (isNotEmpty()){
            int count = 0;
            System.out.println("Список хабарників");

            for (Deputy deputy : listOfDeputies) {
                if (deputy.isBribeTaker()) {
                    System.out.println(deputy.getLastName() + " " + deputy.getFirstName());
                    count++;
                }
            }
            if (count == 0){
                System.out.println("Хабарнеків немає");
            }
        }
    }

    public void printBiggestBribeTaker() {
        if (isNotEmpty()) {
            Collections.sort(listOfDeputies);
            Deputy deputy = listOfDeputies.get(listOfDeputies.size() - 1);
            System.out.println("Найбільший хабарник - " + deputy.getLastName() + " " + deputy.getFirstName() +
                                ", розмір хабаря " + deputy.getSizeOfBribe());
        }
    }

    public void printAllDeputies() {
        if (isNotEmpty()){
            for (Deputy deputy : listOfDeputies) {
                System.out.println(deputy.toString());
            }
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
        int r = (int) (Math.random() * (++max - min)) + min;
        return r;
    }

}
