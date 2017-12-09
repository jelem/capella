package com.hillel;

public class MemberNOfSequenceRecursive {

  public static int memberNOfSequence(int num) {
    if (num == 3 || num == 2 || num == 1) {
      return 1;
    }
    return memberNOfSequence(num - 3) + memberNOfSequence(num - 2) + memberNOfSequence(num - 1);
  }

}
