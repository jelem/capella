package com.dima;

public class Recurtion {

  public static int theSameOfFibonazi(int num) {
    if (num == 1 || num == 2 || num == 3) {
      return 1;
    }
    return theSameOfFibonazi(num - 1) + theSameOfFibonazi(num - 2) + theSameOfFibonazi(num - 3);
  }

  public static int iteratyFibonazi(int num) {
    int f1 = 1;
    int f2 = 1;
    int f3 = 1;
    int f4 = 1;

    for (int i = 4; i <= num; i++) {
      f4 = f1 + f2 + f3;
      f1 = f2;
      f2 = f3;
      f3 = f4;
    }

    return f4;
  }
}





