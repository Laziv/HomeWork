package com.laziv.lesson12.task1;

public class Engine {
    private int amountOfCylinders;

    public Engine(int amountOfCylinders) {
        this.amountOfCylinders = amountOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "amountOfCylinders=" + amountOfCylinders +
                '}';
    }
}