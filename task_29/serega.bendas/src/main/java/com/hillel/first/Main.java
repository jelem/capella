package com.hillel.first;

public class Main {

  public static void main(String[] args) {

    CustomTreeMap customTreeMap = new CustomTreeMap();

    customTreeMap.add(1, "John");
    customTreeMap.add(-5, "Kathy");
    customTreeMap.add(3, "Alex");
    customTreeMap.add(8, "Bred");
    customTreeMap.add(-9, "Jessy");
    customTreeMap.add(-3, "Henry");
    customTreeMap.add(0, "Helga");

    customTreeMap.traverseQueue();

    System.out.println();

    customTreeMap.traverseStack();
  }

}
