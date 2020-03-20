package com.laziv.lesson11;

public class SteeringWheel {
    private int diameter;
    private String material;

    public SteeringWheel(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
