package com.hillel;

public class SequenceMember {

  public static void main(String[] args) {
    System.out.println(sequenceMemberFunctional(7));
  }

  //Сложность экспоненциальная (плохо)
  public static int sequenceMemberFunctional(int n) {
    if (n <= 3) {
      return 1;
    }

    return sequenceMemberFunctional(n - 1) + sequenceMemberFunctional(n - 2)
        + sequenceMemberFunctional(n - 3);

  }

  //Сложность линейная (приемлемо)
  public static int sequenceMemberIterative(int n) {
    int number1 = 1;
    int number2 = 1;
    int number3 = 1;
    int numberSum = 1;

    for (int i = 3; i < n; i++) {
      numberSum = number1 + number2 + number3;
      number1 = number2;
      number2 = number3;
      number3 = numberSum;
    }

    return numberSum;
  }

}
