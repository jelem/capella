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

    String string = scanner.next();
    checkStack(stack, string);
  }

  private static boolean checkStack(MyStack stack, String string) {
    char ch = ' ';
    for (int i = 0; i < string.length(); i++) {
      ch = string.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if (ch == ')') {
        if (stack.isEmpty() || stack.peek() != '(') {
          System.out.println("it has no pars for " + ')' );
          return  false;
        }
        stack.pop();
      } else if (ch == '}') {
        if (stack.isEmpty() || stack.peek() != '{') {
          System.out.println("it has no pars for " + '}' );
          return  false;
        }
        stack.pop();
      } else if (ch == ']') {
        if (stack.isEmpty() || stack.peek() != '[') {
          System.out.println("it has no pars for " + ']' );
          return  false;
        }
        stack.pop();
      }
    }
    if ( !stack.isEmpty()) {
      System.out.println("it has no pars for " + stack.pop());
    }
    return  true;
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
