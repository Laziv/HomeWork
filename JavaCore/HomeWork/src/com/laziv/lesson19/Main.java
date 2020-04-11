package com.laziv.lesson19;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та десереалізацію. Результат Десереалізації вивести на консоль.");
        Methods.serialize(new Employee("Jon", 3, 9999));
        System.out.println(Methods.deserealize());

        System.out.println("\n2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію. Результат вивести на екран.");
        Methods.serialize(new EmployeeTransient("Carl", 10, 8888));
        System.out.println(Methods.deserealize());

        System.out.println("\n3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції");
        Employee[] employees = new Employee[]{new Employee("David", 12, 7777),
                                              new Employee("Eric", 17, 6666),
                                              new Employee("Harry", 22, 5555)};

        Methods.serialize(employees);
        System.out.println(Arrays.toString((Employee[]) Methods.deserealize()));
    }


}
