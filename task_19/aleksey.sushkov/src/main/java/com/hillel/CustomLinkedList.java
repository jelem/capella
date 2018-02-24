package com.hillel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable {

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
    if (first == null && first.next == null) {
      throw new NoSuchElementException("Element not found");
    }
    int res = first.value;
    first = first.next;
    return res;
  }

  public int peek() {
    return first.value;
  }

  public int get(int index) {
    Node element = first;
    while (index > 0) {
      if (element.next == null) {
        throw new NoSuchElementException("Element not found");
      }
      element = element.next;
      index--;
    }
    return element.value;
  }

  public void introduceCycle(int index) {
    Node element = first;
    while (index > 0) {
      if (element.next == null) {
        throw new NoSuchElementException("Element not found");
      }
      element = element.next;
      index--;
    }
    last.next = element;
  }

  public boolean hasCycle() {
    ArrayList<Node> arrayList = new ArrayList<>();
    Node current = first;
    while (current != null) {
      arrayList.add(current);
      current = current.next;
      for (Node node : arrayList) {
        if (current == node) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator {

    Node current;

    ListIterator() {
      current = first;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Object next() {
      int val = current.value;
      current = current.next;
      return val;
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

