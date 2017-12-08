package com.hillel;

public class SequenceIterative {

  private static final int[] sequence = new int[500];
  private static int end = 25;

  public static void main(String[] args) {
    sequenceNumber(end);
    int number = 9;
    int result = sequence[number];
    if (number > end) {
      result = sequenceNumber(number);
      System.out.println(result);
      end = number;
    } else {
      System.out.println(result);
    }
  }

  public static int sequenceNumber(int num) {
    int first = 1;
    int second = 1;
    int third = 1;
    sequence[1] = 1;
    sequence[2] = 1;
    sequence[3] = 1;
    for (int i = 4; i <= end; i++) {
      int sum = first + second + third;
      sequence[i] = sum;
      first = second;
      second = third;
      third = sum;
    }
    return sequence[num];
  }
}
