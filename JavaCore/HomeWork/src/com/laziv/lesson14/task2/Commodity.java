package com.laziv.lesson14.task2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Commodity implements Comparable<Commodity> {
    private String name;
    private double length;
    private double weight;
    private double width;

    public Commodity(String name, double length, double weight, double width) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public int compareTo(Commodity o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }
}
