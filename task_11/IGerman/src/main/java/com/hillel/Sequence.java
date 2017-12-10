package com.hillel;

public class Sequence {

  public static void main(String[] args) { //Экспоненциальная сложность
    int result = sequenceMember(7);
    System.out.println(result);
  }

  public static int sequenceMember(int n) {
    int result = 0;
    if (n < 4) {
      return 1;
    }
    for (int i = 4; i <= n; i++) {
      result = sequenceMember(i - 1) + sequenceMember(i - 2) + sequenceMember(i - 3);
    }
    return result;
  }
}
