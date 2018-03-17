package com.lev;

public class Main {

  public static void main(String[] args) {

    CustomLinkedList list = new CustomLinkedList();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(1);

    list.introduceCycle(1);
    System.out.print(list.hasCycle());
  }
}
