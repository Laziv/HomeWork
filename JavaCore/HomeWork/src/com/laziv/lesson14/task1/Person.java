package com.laziv.lesson14.task1;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if (this.age == p.age) {
            return 0;
        } else if (this.age > p.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
