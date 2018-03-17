package com.lev;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    int numberIn10 = 123;
    Stack<Integer> stack1 = new Stack<>();
    CustomStack stack = new CustomStack(10);
    String brackets = "((({}()[])))";
    Stack<Character> stack2 = new Stack<>();
    char[] array = brackets.toCharArray();

    stack.push(2);
    stack.push(5);
    stack.push(3);

    System.out
        .println(stack.min() + " " + stack.size() + " " + stack.isEmpty() + " " + stack.peek());

    //decimal to binary
    do {
      stack1.add(numberIn10 % 2);
      numberIn10 = numberIn10 / 2;
    }
    while (numberIn10 > 0);

    while (!stack1.empty()) {
      int numberIn2 = stack1.pop();
      System.out.print(numberIn2);
    }

    //brackets
    for (char anArray : array) {
      if (anArray == '{' || anArray == '[' || anArray == '(') {
        stack2.add(anArray);
      } else if (stack2.peek() == '{' && anArray == '}') {
        stack2.pop();
      } else if (stack2.peek() == '[' && anArray == ']') {
        stack2.pop();
      } else if (stack2.peek() == '(' && anArray == ')') {
        stack2.pop();
      } else {
        System.out.println("Error");
      }
    }
  }
}
