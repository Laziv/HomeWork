package com.laziv.lesson14.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person("Ivan", 45));
        people.add(new Person("Logan", 30));
        people.add(new Person("John", 65));
        people.add(new Person("Jackson", 20));

        System.out.println("Невідсорторований список:");
        printPeople(people);

        Set<Person> peopleSorted = new TreeSet<>(people);
        System.out.println("\nВідсорторований список по віку:");
        printPeople(peopleSorted);

        NameComparator nameComparator = new NameComparator();
        Set<Person> peopleSorted2 = new TreeSet<>(nameComparator);
        peopleSorted2.addAll(people);
        System.out.println("\nВідсорторований список по імені:");
        printPeople(peopleSorted2);

    }
    static void printPeople(Set<Person> set){
        for (Person person : set){
            System.out.println(person.toString());
        }
    }
}
