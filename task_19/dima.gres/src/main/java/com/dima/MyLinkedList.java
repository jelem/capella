package com.dima;

import java.util.Iterator;

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
    return 0;
  }

  @Override
  public int peek() {
    return 0;
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
