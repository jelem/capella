package com.hillel;

import java.util.Stack;

public class BinaryCalculator {

  Stack<Integer> stack = new Stack();

  public Stack calculate(int number) {
    while (number != 1 && number != 0) {
      number = convert(number);
    }
    stack.push(number == 0 ? 0 : 1);

    return stack;
  }

  private int convert(int number) {
    int divisionResult = number % 2;

    number = number / 2;

    if (divisionResult > 0) {
      stack.push(1);
    } else {
      stack.push(0);
    }

    return number;
  }
}
