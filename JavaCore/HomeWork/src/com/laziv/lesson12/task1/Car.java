package com.laziv.lesson12.task1;

public class Car {
    private int amountOfHorsepower;
    private int yearOfProduction;
    String name;
    private Engine engine;
    private SteeringWheel steeringWheel;

    public Car(int amountOfHorsepower, int yearOfProduction, String name, Engine engine, SteeringWheel steeringWheel) {
        this.amountOfHorsepower = amountOfHorsepower;
        this.yearOfProduction = yearOfProduction;
        this.name = name;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", amountOfHorsepower=" + amountOfHorsepower +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                ", steeringWheel=" + steeringWheel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
