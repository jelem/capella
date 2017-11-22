package com.hillel;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TaskSix {

  public static void main(String[] args) {
    int[] result = IntStream.range(1,5).toArray();
    System.out.println(result);
  }

}
