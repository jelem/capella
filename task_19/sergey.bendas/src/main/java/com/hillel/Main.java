package com.hillel;

public class Main {

  public static void main(String[] args) {
    CustomLinkedList customLinkedList = new CustomLinkedList();
    customLinkedList.add(0);
    customLinkedList.add(5);
    customLinkedList.add(7);
    customLinkedList.add(10);
    for (Object element : customLinkedList) {
      System.out.println(element);
    }
    System.out.println(customLinkedList.hasCycle());
    customLinkedList.introduceCycle(3);
    System.out.println(customLinkedList.hasCycle());

  }

}
