package com.laziv.lesson17;


public class Main {
    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[17];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = (int) (Math.random() * 1000);
        }
        Collection collection = new Collection(arrayOfIntegers);

        System.out.println("1. Першого класу виводили значення масиву від першого до останнього. Зробити заміну непарних елементів на нуль і вивести на екран даний масив.");
        Collection.Class1 class1 = collection.new Class1();
        while (class1.hasNext()){
            System.out.println(class1.next());
        }

        System.out.println("\n2. Другого класу виводили від останнього до першого значення через одну цифру.");
        Collection.Class2 class2 = collection.new Class2();
        while (class2.hasNext()){
            System.out.println(class2.next());
        }

        System.out.println("\n3. Створити анонімний клас який повинен : прогнати від останнього до першого елементу масиву. Перевірити кожен третій елемент масиву від останнього чи він непарний, якщо так то вивести дані елементи на консоль.");
        collection.runAnonymousClass();

        System.out.println("\n4. Створити Локальний клас який повинен: пройтись від першого до останнього елементу масиву, перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100, і вивести на консоль ці числа.");
        collection.runLocalClass();

        System.out.println("\n5.Створити статичний клас який повинен: пройтись від першого до останнього елемента масиву. Перевірити кожен другий елемент масив на парність, якщо він парний, тоді зробити з нього непарний і вивести дані елементи на консоль.");
        Collection.StaticClass staticClass = new Collection.StaticClass(arrayOfIntegers);
        while (staticClass.hasNext()){
            System.out.println(staticClass.next());
        }
    }
}
