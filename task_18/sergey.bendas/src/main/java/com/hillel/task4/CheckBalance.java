package com.hillel.task4;

import java.util.Stack;

public class CheckBalance {

  public static boolean isBalanceInBrackets(String expression) {

    Stack stack = new Stack();
    char[] chars = expression.toCharArray();
    for (char elem : chars) {
      if (isOpenBracket(elem)) {
        stack.push(elem);
      } else {
        if (elem != oppositeBracket((char) stack.pop())) {
          return false;
        }
      }
    }
    return true;
  }

  private static char oppositeBracket(char pop) {
    if (pop == '(') {
      return ')';
    }
    if (pop == '{') {
      return '}';
    }
    if (pop == '[') {
      return ']';
    }
    return ' ';
  }

  private static boolean isOpenBracket(char elem) {
    return elem == '(' || elem == '{' || elem == '[';
  }
}
