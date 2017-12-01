package com.hillel;

import static java.util.stream.IntStream.concat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArraysTogether {

  public static int[] twoInOne(int[] ar1, int[] ar2) {

    int[] ar3 = new int[ar1.length + ar2.length];

    for (int i = 0; i < ar1.length; i++) {
      ar3[i] = ar1[i];
    }
    for (int i = 0; i < ar2.length; i++) {
      ar3[i + ar1.length] = ar2[i];
    }
    IntStream stream = Arrays.stream(ar3)
        .sorted();

    return stream.toArray();
  }


  public static int[] twoInOneOptimized(int[] ar1, int[] ar2) {

    IntStream stream1 = Arrays.stream(ar1);

    IntStream stream2 = Arrays.stream(ar2);

    IntStream stream3 = concat(stream1, stream2).sorted();

    return stream3.toArray();
  }
}
