package com.hillel;

public class MathHillel {

  public static int sumDigitsOfNumbers (int number) {
    int sumDigits = 0;
    number = Math.abs(number);
    while (number > 0) {
      sumDigits += number % 10;
      number /= 10;
    }
    return sumDigits;
  }

  public static long factorial (long number) {
    long result = 1;
    if (number == 0) {
      return 1;
    }
    if (number > 0) {
      for (int i = 1; i <= number; i++) {
        result *= i;
      }
      return result;
    } else {
      return -1;
    }
  }

  public static int triangleCalculation(int side, String formula) {
    switch (formula) {
      case "perimeter":
        return side * 4;
      case "square":
        return side * side;
      default:
        return 0;
    }
  }
}
