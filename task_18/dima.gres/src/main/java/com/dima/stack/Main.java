package com.dima.stack;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Input num");
    int num = scanner.nextInt();
    MyStack stack = new MyStack();
    fillStack(stack, num);
    burnStack(stack);
  }

  private static void burnStack(MyStack stack) {
    while ( !stack.isEmpty() ) {
      System.out.print(stack.pop());
    }
    System.out.println();
  }

  private static void fillStack(MyStack stack, int num) {
    boolean isNegative = false;
    if (num == 0) {
      stack.push('0');
      return;
    } else if (num < 0) {
      num = - num;
      isNegative = true;
    }
    while (num > 0) {
      stack.push((char) ('0' + num % 2));
      num /= 2;
    }

    stack.push('x');
    stack.push('0');
    if (isNegative) {
      stack.push('-');
    }
  }
}
