package com.dima;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList implements CustomeLinkedList {
  private Node begin;
  private Node end;

  public MyLinkedList() {
    end = begin = null;
  }

  private class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
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
    return 0;
  }

  @Override
  public void introduceCycle(int index) {

  }

  @Override
  public boolean hasCycle() {
    return false;
  }

  @Override
  public Iterator ahead() {
    return null;
  }
}
