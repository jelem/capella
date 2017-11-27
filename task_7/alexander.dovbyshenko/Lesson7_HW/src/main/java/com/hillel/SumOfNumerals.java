package com.hillel;

public class SumOfNumerals {

  public static int sumOfNumbers(int number) {

    int sum = 0;

    while (number > 0) {

      sum += (number % 10);
      number /= 10;

    }
    return sum;
  }

}
