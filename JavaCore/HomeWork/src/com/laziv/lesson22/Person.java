package com.laziv.lesson22;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this(name, (int) (Math.random() * 100));
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  Person(Supplier<Person> supplier){
        this(supplier.get().name, supplier.get().age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
