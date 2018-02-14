package com.hillel;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    CustomList animals = new CustomArrayList();

    // System.out.println(animals.isEmpty());

    animals.add("Dog");
    animals.add("Cat");
    animals.add("Monkey");
    /*
    for (int i = 0; i < animals.size(); i++) {
      System.out.println(animals.get(i));
    }

    animals.set(1, "Doggg");
    for (int i = 0; i < animals.size(); i++) {
      System.out.println(animals.get(i));
    }

    System.out.println(animals.contains("Cat"));

    System.out.println(animals.remove("Monkey"));

    System.out.println(animals.get(1));

  /*  Iterator iterator = animals.iterator();
    while (iterator.hasNext()){
      String animal = (String)iterator.next();
      System.out.println(animal);
    }*/

    for (Object animal : animals) {
      System.out.println((String) animal);
    }

    System.out.println();

    Iterator backwardIterator = animals.backwardIterator();
    while (backwardIterator.hasNext()) {
      String animal = (String) backwardIterator.next();
      System.out.println(animal);
    }

    System.out.println();

    Iterator randomIterator = animals.randomIterator();
    while (randomIterator.hasNext()) {
      String animal = (String) randomIterator.next();
      System.out.println(animal);
    }
  }
}
