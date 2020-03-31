package com.laziv.lesson15;

import java.util.Scanner;

public class Animal {
   private String name;
   private String typeOfAnimal;


   public Animal(String name, String typeOfAnimal) {
      this.name = name;
      this.typeOfAnimal = typeOfAnimal;
   }

   public String getName() {
      return name;
   }

   public String getTypeOfAnimal() {
      return typeOfAnimal;
   }

   @Override
   public String toString() {
      return typeOfAnimal + ", " + name;
   }
}
