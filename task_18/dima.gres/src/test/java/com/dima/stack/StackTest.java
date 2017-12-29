package com.dima.stack;

import org.junit.Test;

import javax.sound.midi.Soundbank;

public class StackTest {

  @Test
  public void minMaxTest() {
    MyStack stack = new MyStack();

    stack.push('g');
    stack.push('c');
    stack.push('s');
    stack.push('a');
    showStack(stack);

    System.out.println("pop: " + stack.pop());
    showStack(stack);
  }

  @Test
  public void minMaxTest2() {
    MyStack stack = new MyStack();

    stack.push('g');
    stack.push('c');
    stack.push('s');
    stack.push('s');
    stack.push('s');
    stack.push('a');
    showStack(stack);

    for (int i = 0; i < 2; i++) {
      System.out.println(stack.pop() + "max " + stack.max());
    }
    showStack(stack);
  }

  @Test
  public void demo1() {
    MyStack stack = new MyStack(MyStack.BIG);
    char ch = 'a';
    while (ch <= 'z') {
      stack.push(ch++);
    }

    do {
      ch = stack.pop();
      System.out.print(ch);
    } while (ch != 'a');

    System.out.println();
  }

  public void showStack(MyStack stack) {
    System.out.print("ch " + stack.peek());
    System.out.print("\tmin " + stack.min());
    System.out.println("\tmax " + stack.max());
  }
}
