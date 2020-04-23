package com.laziv.lesson23.task2;

import java.util.Objects;

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
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Animal animal = (Animal) o;
      return Objects.equals(name, animal.name) &&
              Objects.equals(typeOfAnimal, animal.typeOfAnimal);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, typeOfAnimal);
   }

   @Override
   public String toString() {
      return typeOfAnimal + ", " + name;
   }
}
