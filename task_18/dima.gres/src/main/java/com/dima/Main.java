package com.dima;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    MyList zoo = new MyList();
    zoo.add("Monkey");
    zoo.add("Dolphin");
    zoo.add("Eagle");
    zoo.add("Elephant");
    Iterator iterator = zoo.backward();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("current: " + zoo.getCurrent());

    System.out.println();
    iterator = zoo.ahead();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println();

    System.out.println();
    iterator = zoo.random();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
