package com.dima.stack;

import java.util.NoSuchElementException;

public class MyStack implements CustomeStack {
  public final static int LOW = 10;
  public final static int AVERAGE = 20;
  public final static int BIG = 50;

  private int size;
  private char[] array;
  private char[] maximus;
  private char[] minimals;
  private int pomax;
  private int pomin;
  private int current;
  private char min;
  private char max;

  public MyStack(int size) {
    current = 0;
    pomax = pomin = 0;
    this.size = size;
    array = new char[size];
    minimals = new char[size];
    maximus = new char[size];
  }

  public MyStack() {
    this(AVERAGE);
  }


  @Override
  public void push(char ch) {
    if (current >= size) {
      throw new StackOverflowError("Stack overflow");
    }
    if (current == 0) {
      min = max = ch;
      maximus[pomax++] = ch;
      minimals[pomin++] = ch;
    } else {
      setMinax(ch);
    }
    array[current++] = ch;
  }

  @Override
  public char pop() {
    if (current < 1) {
      throw new NoSuchElementException("...Stack is empty...");
    }
    char tmp = array[--current];
    eraseMinMax(tmp);
    return tmp;
  }

  private void eraseMinMax(char tmp) {
    if (tmp <= min) {
      --pomin;
      min = pomin > 0 ? minimals[pomin - 1] : minimals[0];
    }

    if (tmp >= max) {
      --pomax;
      max = pomin > 0 ? maximus[pomax - 1] : maximus[0];
    }
  }

  @Override
  public char peek() {
    if (current < 1) {
      throw new NoSuchElementException("...Stack is empty...");
    }
    return array[current - 1];
  }

  @Override
  public char max() {
    if (current == 0) {
      throw  new NoSuchElementException("...Stack is Empty...");
    }
    return max;
  }

  @Override
  public char min() {
    if (current == 0) {
      throw  new NoSuchElementException("...Stack is Empty...");
    }
    return min;
  }

  private void setMinax(char ch) {
    if (ch <= min) {
      min = ch;
      minimals[pomin++] = ch;
    }

    if (ch >= max) {
      max = ch;
      maximus[pomax++] = ch;
    }
   }

  public boolean isEmpty() {
    return current == 0;
  }
}
