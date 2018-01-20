package com.dima;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList implements CustomeLinkedList, Iterable {
  private Node begin;
  private Node end;
  private Node looper = null;

  public MyLinkedList() {
    end = begin = null;
  }

  @Override
  public Iterator iterator() {
    return new AheadIterator();
  }

  private static class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private class AheadIterator implements Iterator {
    Node current;

    public AheadIterator() {
      current = begin;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Object next() {
      if (current == null) {
        throw new NoSuchElementException("...elemnt is not found...");
      }
      int tmp = current.value;
      current = current.next;
      return tmp;
    }
  }

  @Override
  public void add(int element) {
    Node current = new Node(element, null);
    if (begin == null) {
      end = begin = current;
    } else {
      end = end.next = current;
    }
  }

  @Override
  public int poll() {
    if (begin == null) {
      throw new NoSuchElementException("...elemnt is not found...");
    }
    int tmp = begin.value;
    begin = begin.next;
    return tmp;
  }

  @Override
  public int peek() {
    if (begin == null) {
      throw new NoSuchElementException("...elemnt is not found...");
    }
    return begin.value;
  }

  @Override
  public int get(int index) {
    Node current = begin;
    while (index > 0 && current != null) {
      index--;
      current = current.next;
    }
    if (current == null) {
      throw new NoSuchElementException("...elemnt is not found...");
    }
    return current.value;
  }

  @Override
  public void introduceCycle(int index) {
    Node current = begin;
    while (index > 0 && current != null) {
      index--;
      current = current.next;
    }
    if (current == null) {
      throw new NoSuchElementException("...elemnt is not found...");
    }
    looper = end;
    end = current;
    end.next = begin;
  }

  @Override
  public boolean hasCycle() {
    return looper != null;
  }
}
