package ua.pp.darknsoft;

public class SequenceClass {

  //--> DIFFICULT: Exponential O(2^N)
  public static int sequenceByRecursiveMethod(int index) {
    if (index <= 3) {
      return 1;
    }

    return sequenceByRecursiveMethod(index - 1) + sequenceByRecursiveMethod(index - 2)
        + sequenceByRecursiveMethod(index - 3);
  }

  //-->DIFFICULT: LINE O(N)
  public static int sequenceByIterationMethod(int index) {
    int member1 = 1, member2 = 1, member3 = 1, memberNext = 1, memberBuf = 1;

    for (int i = 4; i <= index; i++) {
      memberNext = member1 + member2 + member3;
      member1 = member2;
      member2 = member3;
      member3 = memberNext;
    }
    return memberNext;
  }
}
