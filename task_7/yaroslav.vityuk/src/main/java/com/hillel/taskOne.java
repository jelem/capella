package com.hillel;

public class taskOne {

  public static int sumOfDigits(int number) {
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }

  public static int factorial(int numberFac) {
    int result = 1;
    while (numberFac > 1) {
      result *= numberFac;
      numberFac--;
    }
    return result;
  }

  public static int triangleCalculation(int side, String formula) {
    int result = 0;
    switch (formula) {
      case "perimeter":
        result = 4 * side;
        break;
      case "square":
        result = side * side;
        break;
      default:
        return 0;
    }
    return result;
  }

}