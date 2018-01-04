package com.hillel.task1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStackWithoutMinMax {

  private static final int BASE_LEN = 20;
  private List<Integer> list;
  private int maxLen;

  public CustomStackWithoutMinMax(int elements) {
    list = new ArrayList<>(elements);
    maxLen = elements;
  }

  public CustomStackWithoutMinMax() {
    this(BASE_LEN);
  }

  public void push(int value) {
    if (isStackOverflow()) {
      throw new StackOverflowError();
    }
    list.add(value);
  }

  private boolean isStackOverflow() {
    return list.size() == maxLen;
  }

  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return list.remove(lastIndex());
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return list.get(lastIndex());
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int size() {
    return list.size();
  }

  public int lastIndex() {
    return size() - 1;
  }
}
