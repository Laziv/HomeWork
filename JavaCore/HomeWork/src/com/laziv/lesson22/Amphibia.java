package com.laziv.lesson22;

import java.util.function.Consumer;

public class Amphibia extends Frog{
    private Consumer<String> consumer = System.out::println;

    public void sleep() {
        consumer.accept("the animal sleeps");
    }

    public void eat() {
        consumer.accept("the animal eats");
    }

    public void swim() {
        consumer.accept("the animal swims");
    }

    public void walk() {
        consumer.accept("the animal walks");
    }

}