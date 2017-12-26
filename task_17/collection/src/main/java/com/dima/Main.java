package com.dima;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    MyList myList = new MyList();
    myList.add("One");
    myList.add("Two");
    myList.add("Three");
    myList.add("For");
    myList.add("Five");
    Iterator backward = myList.backward();
    while (backward.hasNext()) {
      System.out.println(backward.next());
    }
  }
}
