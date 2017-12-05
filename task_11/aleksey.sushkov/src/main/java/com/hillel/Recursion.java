package com.hillel;

public class Recursion {

  public static void main(String[] args) {
    System.out.println("Recursion: " + tripleFibRec(7));
    System.out.println("Iteration: " + tripleFibIter(7));
  }

  // 0(3 ^ n)     (truly something less than 3 ^ n, but...)
  public static int tripleFibRec(int n) {
    if (n == 1 || n == 2 || n == 3) {
      return 1;
    }
    return tripleFibRec(n - 1) + tripleFibRec(n - 2) + tripleFibRec(n - 3);
  }

  // 0(n)
  public static int tripleFibIter(int n) {
    int f1 = 1;
    int f2 = 1;
    int f3 = 1;
    int fnext = 1;
    for (int i = 3; i < n; i++) {
      fnext = f1 + f2 + f3;
      f1 = f2;
      f2 = f3;
      f3 = fnext;
    }
    return fnext;
  }

}