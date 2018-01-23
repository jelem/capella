package com.hillel;

import java.util.Stack;

public class BracketsSort {

  public boolean isArranged(String brackets) {
    Stack stack = new Stack();
    char[] bracketsArray = brackets.toCharArray();
    for (char element : bracketsArray) {
      if (element == '(' || element == '[' || element == '{') {
        stack.push(element);
      }
      if (element == ')') {
        if (stack.peek().equals('(')) {
          stack.pop();
        } else {
          return false;
        }
      }
      if (element == ']') {
        if (stack.peek().equals('[')) {
          stack.pop();
        } else {
          return false;
        }
      }
      if (element == '}') {
        if (stack.peek().equals('{')) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
