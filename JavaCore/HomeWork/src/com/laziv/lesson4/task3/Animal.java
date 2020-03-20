package com.laziv.lesson4.task3;

public class Animal {
    private String name;
    private int age;
    private int speed;

    public Animal(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}