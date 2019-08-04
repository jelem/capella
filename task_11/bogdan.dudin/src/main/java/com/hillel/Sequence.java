package com.hillel;

public class Sequence {

  public static int iterative(int n) {
    if (n == 0)
      return 0;

    int x = 1;
    int y = 1;
    int z = 1;
    int j = 1;

    for (int i = 0; i < n - 3; i++) {
      j = x + y + z;
      x = y;
      y = z;
      z = j;
    }
    return j;
  }

  public static int recursive(int n) {
    if (n > 3){
       return recursive(n - 1) + recursive(n - 2) + recursive(n - 3);
    }
    else if (n == 0){
      return 0;
    }
    else{
      return 1;
    }
  }
}
