package com.hillel;

public class MemberNOfSequenceRecursive {

  public static int memberNOfSequence(int n) {
    if (n == 3 || n == 2 || n == 1) {
      return 1;
    }
    return memberNOfSequence(n - 3) + memberNOfSequence(n - 2) + memberNOfSequence(n - 1);
  }

}
