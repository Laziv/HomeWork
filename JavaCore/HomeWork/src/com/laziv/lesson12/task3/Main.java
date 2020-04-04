package com.laziv.lesson12.task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        System.out.println("Array List:");
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

        //LinkedList
        System.out.println("\nLinked List:");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test0");
        myLinkedList.add("test2");
        myLinkedList.add(1 ,"test1");
        myLinkedList.add("test3");

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        myLinkedList.remove(0);

        System.out.println("Після видалення першого елементу");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        myLinkedList.remove(myLinkedList.size() - 1);

        System.out.println("Після видалення останього елементу");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }


    }
}
