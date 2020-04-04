package com.laziv.lesson16;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //Task1
        System.out.println("Task 1");
        Class catClass = Cat.class;

        System.out.println("Ім'я классу: " + catClass.getName());

        System.out.println("\nКонструктори:");
        for(Constructor constructor : catClass.getDeclaredConstructors()){
            System.out.print(Modifier.toString(constructor.getModifiers()) + " ");
            System.out.println(constructor.getName());
            System.out.println("Кількість параметрів: " + constructor.getParameterCount() + "");
        }

        System.out.println("\nМетоди:");
        for(Method method : catClass.getDeclaredMethods()){
            System.out.print(Modifier.toString(method.getModifiers()) + " ");
            System.out.println(method.getName());
            System.out.println("Кількість параметрів: " + method.getParameterCount() + "");
        }

        System.out.println("\nПоля:");
        for(Field field : catClass.getDeclaredFields()){
            System.out.print(Modifier.toString(field.getModifiers()) + " ");
            System.out.println(field.getName());
        }

        //Task 2
        System.out.println("\nTask2\n");

        Cat cat = new Cat(5, "Мурзік");
        System.out.println("Before " + cat.toString());

        Field name = catClass.getDeclaredField("name");
        Field age = catClass.getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);
        name.set(cat, "new cat");
        age.set(cat, 10);
        System.out.println("After " + cat.toString() + "\n");

        Method printMassage = catClass.getDeclaredMethod("printMessage", String.class, int.class);
        printMassage.setAccessible(true);
        printMassage.invoke(cat,"Test massage", 3);

        Method printMassage2 = catClass.getDeclaredMethod("printMessage", String.class);
        printMassage2.setAccessible(true);
        printMassage2.invoke(cat,"Test massage 2");

    }

}

class Cat{
    private int age;
    private String name;

    private Cat(){

    }
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void printMessage(String msg){
        printMessage(msg, 1);
    }

    private void printMessage(String msg, int amount){
        for (int i = 0; i < amount; i++) {
            System.out.println(msg);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}