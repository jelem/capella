package com.hillel;

public class Homework11 {

  /*
  Exponential complexity
   */
  public static int tribonachiRecursion(int num) {
    if (num < 3) {
      return 1;
    }
    return tribonachiRecursion(num - 1) + tribonachiRecursion(num - 2) + tribonachiRecursion(
        num - 3);
  }

  /*
  Linear complexity
   */
  public static int tribonachiIterative(int num) {
    int t1 = 1;
    int t2 = 1;
    int t3 = 1;
    int res = 1;
    for (int i = 3; i <= num; i++) {
      res = t1 + t2 + t3;
      t1 = t2;
      t2 = t3;
      t3 = res;
    }
    return res;
  }
}
