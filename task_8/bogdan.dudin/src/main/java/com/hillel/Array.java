package com.hillel;

import java.util.Arrays;

public class Array {

  public static int sumOfElements(int[] array) {
    return Arrays.stream(array).sum();
  }
}
