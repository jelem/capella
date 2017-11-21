package com.hillel;

public class SumOfDigits {

  public static int sumOfDigits(int number) {
    int result = 0;
    int remainder;
    while (number != 0) {
      remainder = number % 10;
      result += remainder;
      number /= 10;
    }
    return result;
  }

}
