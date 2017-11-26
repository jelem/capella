package com.hillel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array6_1 {

  public static void main(String[] args) {
  }

  public void divisionBy3Array(int[] ar) {
    IntStream stream = Arrays.stream(ar);
    stream
        .filter(el -> el % 3 == 0)
        .forEach(el -> System.out.println(el));
  }

  public void evenElementArray(int[] ar) {
    IntStream.range(ar[0], ar[ar.length])
        .filter(elem -> elem % 3 == 0)
        .forEach(elem -> System.out.println(elem));
  }

  public void nElementsArray_1(int n) {
    IntStream.rangeClosed(0, n)
        .forEach(e -> System.out.println(e));
  }
}
