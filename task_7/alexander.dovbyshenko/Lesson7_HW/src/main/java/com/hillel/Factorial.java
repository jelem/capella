package com.hillel;

public class Factorial {

  public static int factorialCount(int number) {

    int sum = 1;
    int i;

    for (i = 1; i < number + 1; i++) {

      sum *= i;

    }

    return sum;
  }

}
