package com.hillel;

import static java.lang.Integer.parseInt;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    calculate10to2(45);
    calculate10to2(985);

    System.out.println(checkBrackets("((({}()[])))"));
    System.out.println(checkBrackets("(({)})"));
    System.out.println(checkBrackets("{([])}"));
  }

  public static void calculate10to2(int number) {

    Stack<Integer> stack = new Stack<>();
    while (number != 1) {
      stack.push(number % 2);
      number = number / 2;
    }
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(number);
    while (!stack.empty()) {
      stringBuilder.append(stack.pop());
    }
    System.out.println(parseInt(stringBuilder.toString()));
  }

  public static boolean checkBrackets(String string) {

    char[] chars = string.toCharArray();
    Stack<Integer> stack = new Stack<>();

    stack.push((int) chars[0]);

    for (int i = 1; i < chars.length; i++) {
      if (!stack.empty()
          && ((int) chars[i] == (stack.peek() + 1)
          || (int) chars[i] == (stack.peek() + 2))) {
        stack.pop();
      } else {
        stack.push((int) chars[i]);
      }
    }
    return stack.empty();
  }
}
