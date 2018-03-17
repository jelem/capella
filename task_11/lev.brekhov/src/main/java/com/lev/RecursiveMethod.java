package com.lev;

public class RecursiveMethod {

  public static void main(String[] args) {
    int result = sequenceRecursive(9);// РЕКРУСИВНЫЙ МЕТОДЕ  - ЭКСПОНЕНЦИАЛЬНЫЙ
    System.out.println(result);
    int res = sequenceFor(9);// МЕТОД ЦИКЛА - ЛИНЕЙНЫЙ
    System.out.println(res);
  }

  public static int sequenceRecursive(int num) {
    if (num <= 3) {
      return 1;
    }
    return sequenceRecursive(num - 3) + sequenceRecursive(num - 2) + sequenceRecursive(num - 1);
  }

  public static int sequenceFor(int num) {
    int n1 = 1;
    int n2 = 1;
    int n3 = 1;
    int n4 = 1;
    for (int i = 3; i < num; i++) {
      n4 = n1 + n2 + n3;
      n1 = n2;
      n2 = n3;
      n3 = n4;
    }
    return n4;
  }
}
