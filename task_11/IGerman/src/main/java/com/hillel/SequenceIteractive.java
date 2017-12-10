package com.hillel;

public class SequenceIteractive {

  public static void main(String[] args) { //Линейная сложность
    int result = sequenceMember(7);
    System.out.println(result);
  }

  public static int sequenceMember(int n) {

    int[] ar = new int[n];
    ar[0] = 1;
    ar[1] = 1;
    ar[2] = 1;

    for (int i = 3; i < n; i++) {
      ar[i] = ar[i - 1] + ar[i - 2] + ar[i - 3];
    }
    return ar[n - 1];
  }
}
