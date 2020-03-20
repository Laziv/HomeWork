package com.laziv.lesson4.task2;

public class Main {
    public static void main(String[] args) {
        SteeringWheel steeringWheel = new SteeringWheel(40, "sports", "brown");
        Wheel wheel = new Wheel(17);
        CarBody carBody = new CarBody("black", "sedan", 4);
        Car car = new Car("Honda Acord", 250, "automatic ", 2.5, steeringWheel, wheel, carBody);

        System.out.println(car.toString());
    }
}