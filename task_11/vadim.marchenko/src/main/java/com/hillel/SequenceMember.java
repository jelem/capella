package com.hillel;

public class SequenceMember {

  public static void main(String[] args) {
    System.out.println(sequenceMemberFunctional(7));
  }

  //Сложность экспоненциальная (плохо)
  public static int sequenceMemberFunctional(int numberOfMember) {
    if (numberOfMember <= 3) {
      return 1;
    }

    return sequenceMemberFunctional(numberOfMember - 1)
        + sequenceMemberFunctional(numberOfMember - 2)
        + sequenceMemberFunctional(numberOfMember - 3);

  }

  //Сложность линейная (приемлемо)
  public static int sequenceMemberIterative(int numberOfMember) {
    int number1 = 1;
    int number2 = 1;
    int number3 = 1;
    int numberSum = 1;

    for (int i = 3; i < numberOfMember; i++) {
      numberSum = number1 + number2 + number3;
      number1 = number2;
      number2 = number3;
      number3 = numberSum;
    }

    return numberSum;
  }

}
