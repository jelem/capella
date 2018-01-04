package com.dima;

public class Recurtion {

  public static int theSameOfFibonazi(int num) {
    if (num == 1 || num == 2 || num == 3) {
      return 1;
    }
    return theSameOfFibonazi(num - 1) + theSameOfFibonazi(num - 2) + theSameOfFibonazi(num - 3);
  }

  public static int iteratyFibonazi(int num) {
    int fib1 = 1;
    int fib2 = 1;
    int fib3 = 1;
    int fib4 = 1;

    for (int i = 4; i <= num; i++) {
      fib4 = fib1 + fib2 + fib3;
      fib1 = fib2;
      fib2 = fib3;
      fib3 = fib4;
    }

    return fib4;
  }
}





