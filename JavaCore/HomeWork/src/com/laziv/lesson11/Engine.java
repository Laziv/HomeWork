package com.laziv.lesson11;

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