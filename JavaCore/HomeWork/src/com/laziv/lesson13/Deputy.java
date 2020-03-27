package com.laziv.lesson13;

import java.util.Scanner;

public class Deputy extends Person implements Comparable<Deputy> {
    private String firstName;
    private String lastName;
    private boolean isBribeTaker;
    private int sizeOfBribe;

    public Deputy(int age, int weight, String firstName, String lastName, boolean isBribeTaker) {
        super(age, weight);
        this.firstName = firstName;
        this.lastName = lastName;
        this.isBribeTaker = isBribeTaker;
    }

    public void giveBride() {
        if (isBribeTaker) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Цей депутат просить хабар, введіть суму хабаря");
            int size = scanner.nextInt();

            if (size > 5000) {
                System.out.println("Миліція увязнить депутата");
            } else {
                sizeOfBribe = size;
            }
        } else {
            System.out.println("Цей депутат не бере хабарів");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSizeOfBribe() {
        return sizeOfBribe;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isBribeTaker() {
        return isBribeTaker;
    }

    @Override
    public int compareTo(Deputy deputy) {
        if (deputy.getSizeOfBribe() == getSizeOfBribe()) {
            return 0;
        } else if (deputy.getSizeOfBribe() > getSizeOfBribe()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Депутат " + lastName + " " + firstName  + ", вік " + super.getAge()  +
                " р. вага " + super.getWeight() + " кг. " + (isBribeTaker ?  "хабарник" : "не хабарник");
    }
}
