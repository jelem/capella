package com.hillel;

import com.hillel.task2.CustomArrayList;
import com.hillel.task2.CustomList;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    CustomList animals = new CustomArrayList();

    animals.add("Dog");
    animals.add("Cat");
    animals.add("Monkey");

    for (Object animal : animals) {
      System.out.println(animal);
    }

    Iterator iterator = animals.iterator();
    while (iterator.hasNext()) {
      String animal = (String) iterator.next();
      System.out.println(animal);
    }
  }
}
