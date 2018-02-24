package com.hillel;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {

    CustomLinkedList testlist = new CustomLinkedList();
    testlist.add(3);
    testlist.add(7);
    testlist.add(16);
    testlist.add(84);
    testlist.introduceCycle(0);
    boolean alpha = testlist.hasCycle();
    System.out.println(alpha);
  }
}