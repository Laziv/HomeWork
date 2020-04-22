package com.laziv.lesson21;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Cat {

    @FieldInfo(type = "String")
    private String name;

    @FieldInfo(type = "byte")
    private byte age;

    @FieldInfo(type = "int")
    private int weight;

    private String color;
    private String breed;
}
