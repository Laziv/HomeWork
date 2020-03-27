package com.laziv.lesson12.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("test0");
        myArrayList.add("test2");
        myArrayList.add(1 ,"test1");
        myArrayList.add("test3");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.remove(0);

        System.out.println("Після видалення першого елементу");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.remove(myArrayList.size() - 1);

        System.out.println("Після видалення останього елементу");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
