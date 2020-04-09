package com.laziv.lesson18;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(new Integer(1));
        //list.add(new String("str"));
        //в массив List<Integer>  об’єкт типу String додати не можимо
        //Можимо тільки коли створимо List сирого типу

        List list2 = new ArrayList();
        list2.add(1);
        list2.add(new String("str"));
        for (Object o : list2) {
            System.out.println(o);
        }

        //Task 2
        System.out.println("\nTask2");
        Map<Integer, String> myMap = new Map<>();
        myMap.put(50, "Test1");
        myMap.put(23, "Test2");
        myMap.put(56, "Test3");
        myMap.put(21, "Test4");
        myMap.remove(21);
        myMap.printMap();

    }
}
