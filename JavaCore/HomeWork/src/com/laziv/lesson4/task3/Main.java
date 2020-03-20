package com.laziv.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Лев", 8, 80);
        System.out.println(String.format("Назва тварини = %s, Швидкість тварини = %d км/год, Вік тварини = %d років", animal.getName(), animal.getSpeed(), animal.getAge()));

        animal.setName("Черепаха");
        animal.setAge(10);
        animal.setSpeed(5);
        System.out.println(String.format("Назва тварини = %s, Швидкість тварини = %d км/год, Вік тварини = %d років", animal.getName(), animal.getSpeed(), animal.getAge()));
    }
}