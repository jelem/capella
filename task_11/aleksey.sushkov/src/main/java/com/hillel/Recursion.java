package com.hillel;

public class Recursion {

  public static void main(String[] args) {
    System.out.println("Recursion: " + tripleFibRec(7));
    System.out.println("Iteration: " + tripleFibIter(7));
  }

  // 0(3 ^ n)     (truly something less than 3 ^ n, but...)
  public static int tripleFibRec(int number1) {
    if (number1 == 1 || number1 == 2 || number1 == 3) {
      return 1;
    }
    return tripleFibRec(number1 - 1) + tripleFibRec(number1 - 2) + tripleFibRec(number1 - 3);
  }

  // 0(n)
  public static int tripleFibIter(int number2) {
    int f1 = 1;
    int f2 = 1;
    int f3 = 1;
    int fnext = 1;
    for (int i = 3; i < number2; i++) {
      fnext = f1 + f2 + f3;
      f1 = f2;
      f2 = f3;
      f3 = fnext;
    }
    return fnext;
  }

}