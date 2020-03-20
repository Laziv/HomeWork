package com.laziv.lesson4.task2;

public class SteeringWheel {
    private double diameter;
    private String type;
    private String color;

    public SteeringWheel(double diameter, String type, String color) {
        this.diameter = diameter;
        this.type = type;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return color + " " + type + " steering wheel with a diameter of " + diameter + "cm";
    }
}
