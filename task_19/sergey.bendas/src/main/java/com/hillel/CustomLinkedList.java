package com.hillel;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class CustomLinkedList implements Iterable {

  private Node first;

  public void add(int element) {
    if (hasCycle()) {
      System.out.println("Cycle in List");
      return;
    }
    Node newNode = new Node(element, null);
    if (first == null) {
      first = newNode;
    } else {
      Node last = getLast();
      last.next = newNode;
    }
  }

  private Node getLast() {
    Node current = first;
    while (current.next != null) {
      current = current.next;
    }
    return current;
  }

  public int poll() {
    int value = peek();
    first = first.next;
    return value;
  }

  public int peek() {
    return get(0);
  }

  public int get(int index) {
    Node current = first;
    while (index > 0 && current != null) {
      current = current.next;
      index--;
    }
    if (current == null) {
      throw new NoSuchElementException();
    }
    return current.value;
  }

  public void introduceCycle(int index) {
    getLast().next = getNode(index);
  }

  private Node getNode(int index) {
    Node current = first;
    while (index > 0 && current != null) {
      current = current.next;
      index--;
    }
    if (current == null) {
      throw new NoSuchElementException();
    }
    return current;
  }

  public boolean hasCycle() {

    ArrayList<Node> arrayList = new ArrayList<>();
    Node current = first;
    while (current != null) {
      arrayList.add(current);
      current = current.next;
      if (isInList(current, arrayList)) {
        return true;
      }
    }
    return false;
  }



  //Травис ругается на этот код

  public boolean hasCycle2() {
    //этот метод должен определить есть ли цикл в списке
    try {
      return goToEnd(first);
    } catch (StackOverflowError error) {
      return true;
    }
  }

  private boolean goToEnd(Node node) {
    if (node != null) {
      return goToEnd(node.next);
    }
    return false;
  }


  @Override
  public Iterator iterator() {
    return new LinkedListIterator();
  }

  private boolean isInList(Node current, ArrayList<Node> arrayList) {
    for (Node node : arrayList) {
      if (current == node) {
        return true;
      }
    }
    return false;
  }

  //добавьте итератор

  private class LinkedListIterator implements Iterator {

    Node node;

    LinkedListIterator() {
      node = first;
    }

    @Override
    public boolean hasNext() {
      return node != null;
    }

    @Override
    public Object next() {
      if (node == null) {
        throw new NoSuchElementException();
      }
      int newValue = node.value;
      node = node.next;
      return newValue;
    }
  }

  private static class Node {

    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}

