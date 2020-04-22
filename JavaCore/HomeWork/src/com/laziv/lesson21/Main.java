package com.laziv.lesson21;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Task1
        try {
            saveFieldsWithAnnotation(new Cat());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nTask2");
        Date date = new Date();
        System.out.println("Дата до конвертування: " + date);
        System.out.println("Після конвертування: ");
        System.out.println("Дата: " + convertToLocalDate(date));
        System.out.println("Час: " + convertToLocalTime(date));
        System.out.println("Дата і час: " + convertToLocalDateTime(date));
    }

    public static void saveFieldsWithAnnotation(Object o) throws IOException {
        Class oClass = o.getClass();
        FileWriter writer = new FileWriter("src\\com\\laziv\\lesson21\\listFieldsWithAnnotation.txt");
        for(Field field : oClass.getDeclaredFields()){
            if (field.isAnnotationPresent(FieldInfo.class)){
                writer.write(field.getName() + "\n");
            }
        }
        writer.close();
    }

    public static LocalDate convertToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalTime convertToLocalTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }
    public static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
