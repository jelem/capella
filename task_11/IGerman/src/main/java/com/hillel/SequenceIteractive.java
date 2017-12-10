package com.hillel;

public class SequenceIteractive {

  public static void main(String[] args) { //Линейная сложность
    int result = sequenceMember(7);
    System.out.println(result);
  }

  public static int sequenceMember(int number) {

    int[] ar = new int[number];
    ar[0] = 1;
    ar[1] = 1;
    ar[2] = 1;

    for (int i = 3; i < number; i++) {
      ar[i] = ar[i - 1] + ar[i - 2] + ar[i - 3];
    }
    return ar[number - 1];
  }
}
