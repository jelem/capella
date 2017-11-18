package com.hillel;

public class Homework7 {

  public static int sumOfNumbers(int number) {
    int result = 0;
    while (number > 0) {
      result += number % 10;
      number /= 10;
    }
    return result;
  }

  public static long factorial(int number) {
    long result = 1;
    while (number > 0) {
      result *= number;
      number--;
    }
    return result;
  }

  public static int triangleCalculation(int side, String formula) {
    switch (formula) {
      case "square":
        return side * side;
      case "perimeter":
        return side * 4;
      default:
        return 0;
    }
  }
}
