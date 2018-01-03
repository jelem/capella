package com.hillel.task1;

import java.util.EmptyStackException;

public class CustomStack {

  private static final int BASE_LEN = 20;
  CustomStackWithoutMinMax stack;
  CustomStackWithoutMinMax minStack;
  CustomStackWithoutMinMax maxStack;

  public CustomStack(int elements) {
    stack = new CustomStackWithoutMinMax(elements);
    maxStack = new CustomStackWithoutMinMax(elements);
    minStack = new CustomStackWithoutMinMax(elements);
  }

  public CustomStack() {
    this(BASE_LEN);
  }

  public void push(int value) {
    stack.push(value);
    if (minStack.isEmpty() || maxStack.isEmpty()) {
      minStack.push(value);
      maxStack.push(value);
      return;
    }
    if (minStack.peek() >= value) {
      minStack.push(value);
    }
    if (maxStack.peek() <= value) {
      maxStack.push(value);
    }
  }

  public int pop() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }
    int value = stack.pop();
    if (value == minStack.peek()) {
      minStack.pop();
    }
    if (value == maxStack.peek()) {
      maxStack.pop();
    }
    return value;
  }

  public int peek() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.peek();
  }

  public int min() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return minStack.peek();
  }

  public int max() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return maxStack.peek();
  }
}
