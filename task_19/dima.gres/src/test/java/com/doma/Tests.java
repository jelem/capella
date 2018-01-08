package com.doma;

import static org.junit.Assert.assertEquals;

import com.dima.MyLinkedList;

import org.junit.Test;

import java.util.Iterator;


public class Tests {
  int actual;

  @Test
  public void addTest() {
    MyLinkedList list = new MyLinkedList();
    list.add(1);
    list.add(2);
    actual = list.peek();
    assertEquals(actual, 1);
  }

  @Test
  public void pollTest() {
    MyLinkedList list = new MyLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    for (int i = 0; i < 3; i++) {
      actual = list.poll();
      assertEquals(actual, i + 1);
    }
  }

  @Test
  public void iteratorTest() {
    MyLinkedList list = new MyLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
    list.add(777);
    iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
  }

  @Test
  public void getTest() {
    MyLinkedList list = new MyLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    actual = list.get(0);
    assertEquals(actual, 1);
    actual = list.get(2);
    assertEquals(actual, 3);
  }
}
