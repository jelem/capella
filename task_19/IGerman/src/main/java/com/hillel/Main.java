package com.hillel;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    CustomLinkedList list = new CustomLinkedList();
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(-9);
    list.add(5);
    list.add(7);
    list.add(8);

    System.out.println(list.get(3));
    System.out.println(list.poll());
    System.out.println(list.peek());
    System.out.println(list.hasCycle());
    list.introduceCycle(2);
    System.out.println(list.hasCycle());

    /*
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      int element = (int) iterator.next();
      System.out.println(element);
    }
    */

    for (Object element : list) {
      System.out.println(element);
    }
    
  }
}
