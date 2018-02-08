package com.hillel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable {

  private Node first;
  private Node last;


  public CustomLinkedList() {
    this.first = null;
  }

  public void add(int element) {

    Node current = new Node(element, null);

    if (first == null) {
      first = last = current;
    }
    last.next = current;
    last = current;
  }

  public int poll() {
    Node current = first;
    first = first.next;
    return current.value;
  }


  public int peek() {
    return first.value;
  }

  public int get(int index) {
    Node current = first;
    int count = 0;
    while (current != null && count < index) {

      current = current.next;
      count++;
    }
    if (current == null) {
      throw new NoSuchElementException();
    }
    return current.value;
  }

  public void introduceCycle(int index) {
    //зациклите список в этом методе
    Node current = first;
    int count = 0;
    Node currentByIndex;

    while (current != null && count < index) {
      current = current.next;
      count++;
    }
    if (current == null) {
      throw new NoSuchElementException();
    }

    currentByIndex = current;
    current = first;
    while (current.next != null) {
      current = current.next;
    }
    last = current;
    last.next = currentByIndex;
  }

  public boolean hasCycle() {
    //этот метод должен определить есть ли цикл в списке
    Node current = first;
    Node currentFast = first;
    while (current.next != null && currentFast.next.next.next != null) {

      currentFast = currentFast.next.next.next;
      current = current.next;

      if (current == currentFast) {
        return true;
      }
    }
    return false;
  }

  //добавьте итератор

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator {

    Node current;

    public ListIterator() {
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

  private class Node {

    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}


