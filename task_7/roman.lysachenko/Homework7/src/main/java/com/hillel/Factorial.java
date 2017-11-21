package com.hillel;

public class Factorial {

  public static int factorial(int number) {
    if(number == 0){
      return 0;
    }
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }

}