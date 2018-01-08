package com.dima;

import java.util.Iterator;

public interface CustomeLinkedList {

  void add(int element);

  int poll();

  int peek();

  int get(int index);

  void introduceCycle(int index);

  boolean hasCycle();
}
