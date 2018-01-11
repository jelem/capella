package com.lev;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable {

  private class Node {
    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private Node first;
  private Node last;

  public CustomLinkedList() {
    first = null;
    last = null;
  }

  public void add(int element) {
    Node current = new Node(element, null);

    if (first == null) {
      first = last = current;
    } else {
      last.next = current;
      last = current;
    }
  }

  public int poll() {
    int value = first.value;
    first = first.next;
    return value;
  }

  public int peek() {
    return first.value;
  }

  public int get(int index) {
    int counter = 0;
    Node current = first;

    while (current != null && counter < index) {
      counter++;
      current = current.next;
    }

    if (current == null) {
      throw new NoSuchElementException();
    }

    return current.value;
  }

  public void introduceCycle(int index) {
    int counter = 0;
    Node current = first;

    while (current != null && counter < index) {
      counter++;
      current = current.next;
    }

    last.next = current;
    //зациклите список в этом методе
  }

  public boolean hasCycle() {
    //этот метод должен определить есть ли цикл в списке
    return false;
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator {

    Node current;

    ListIterator (){
      current = first;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Object next() {
      int value = current.value;
      current = current.next;
      return value;
    }
  }
}
