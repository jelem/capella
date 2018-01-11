package com.hillel.task3;

import java.util.Stack;

public class Convertor {

  public static String intToBin(int number) {
    Stack stack = new Stack();

    do {
      stack.push(number % 2);
      number /= 2;
    }
    while (number > 0);
    StringBuilder string = new StringBuilder();
    do {
      string.append(stack.pop());
    }
    while (!stack.isEmpty());
    return string.toString();
  }
}
