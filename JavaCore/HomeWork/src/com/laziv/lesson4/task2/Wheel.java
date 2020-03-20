package com.laziv.lesson4.task2;

public class Wheel {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public String toString() {
        return "wheels with a radius of " + radius + " inches";
    }
}