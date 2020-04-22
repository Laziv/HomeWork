package com.laziv.lesson22;

import com.laziv.lesson5.task5.Amphibia;
import com.laziv.lesson5.task5.Frog;

import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        Pet cat = () -> System.out.println("Я кіт - Мяууу-Мяууу");
        cat.voice();
        Pet dog = () -> System.out.println("Я пес - Гаууу-Гаууу");
        dog.voice();
        Pet cow = () -> System.out.println("Я корова - Мууу-Мууу");
        cow.voice();


        System.out.println("\nTask2");
        Coin coin = () -> System.out.println((int) (Math.random() * 2) == 0 ? "Орел" : "Решка");
        coin.throwCoin();


        System.out.println("\nTask3");
        BiConsumer<String, Double> biConsumer = (str, x) -> System.out.println(str + ": " + x);
        biConsumer.accept("Максимальне число типу double в експоненціальній формі", Double.MAX_VALUE);
        biConsumer.accept("Мінімальне число типу double в експоненціальній формі", Double.MIN_VALUE);

        BiConsumer<String, Float> biConsumer2 = (str, x) -> System.out.println(str + ": " + x);
        biConsumer2.accept("Максимальне число типу float в експоненціальній формі", Float.MAX_VALUE);
        biConsumer2.accept("Мінімальне число типу float в експоненціальній формі", Float.MIN_VALUE);

        System.out.println("\nTask4");
        Supplier<Person> supplier = () -> new Person("Jack");
        System.out.println(new Person(supplier));

        System.out.println("\nTask5");
        Amphibia frog = new Frog();
        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();
    }
}