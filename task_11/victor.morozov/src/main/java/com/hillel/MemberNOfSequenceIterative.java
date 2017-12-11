package com.hillel;

public class MemberNOfSequenceIterative {

  public static int memberNOfSequenceIterative(int number) {
    int m1 = 1;
    int m2 = 1;
    int m3 = 1;
    int mn = 0;
    if (number < 4) {
      return 1;
    }
    for (int i = 4; i <= number ; i++) {
      mn = m3 + m2 + m1;
      m1 = m2;
      m2 = m3;
      m3 = mn;
    }
    return mn;
  }

}
