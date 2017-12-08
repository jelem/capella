package com.hillel;

public class Sequence {

  public static void main(String[] args) {
    System.out.println(recursionSequenceNumber(8));
  }

  public static int recursionSequenceNumber(int number) {
    if (number <= 3) {
      return 1;
    }
    return recursionSequenceNumber(number - 1) + recursionSequenceNumber(number - 2)
        + recursionSequenceNumber(number - 3);
  }
}
