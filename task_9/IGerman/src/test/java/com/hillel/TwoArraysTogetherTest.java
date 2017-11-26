package com.hillel;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArraysTogetherTest {

  @Test
  public void shouldTwoArraysInOne() {
    int[] ar1 = {1, 2, 7};
    int[] ar2 = {3, 4, 5, 6, 9, 12};
    int[] result = TwoArraysTogether.twoInOne(ar1, ar2);

    IntStream stream = Arrays.stream(result);
    stream.forEach(e -> System.out.print(e + " "));
  }

  @Test
  public void shouldTwoArraysInOneOptimised() {
    int[] ar1 = {1, 2, 7};
    int[] ar2 = {3, 4, 5, 6, 9, 12};
    int[] result = TwoArraysTogether.twoInOneOptimized(ar1, ar2);

    IntStream stream = Arrays.stream(result);
    stream.forEach(e -> System.out.print(e + " "));
  }
}
