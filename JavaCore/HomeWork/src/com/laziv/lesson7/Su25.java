package com.laziv.lesson7;

public class Su25 implements SpecialAbilitiesAirplane {
    private int maxSpeed;
    private String color;
    public ControlAirplane controlAirplane;

    public Su25(int maxSpeed, String color, ControlAirplane controlAirplane) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.controlAirplane = controlAirplane;
    }

    public void turboBoost() {
        System.out.println("Включено турбо прискорення зі швидкістю " + Random.getRandomNum(maxSpeed, 2000) + " км/год.");
    }

    public void technologyStealth() {
        System.out.println("Латака не буде видно на протязі " + Random.getRandomNum(100, 200) + " сек.");
    }

    public void nuclearStrike() {
        System.out.println("Літак скинув " + Random.getRandomNum(1, 10) + " боєголовок");
    }
}
