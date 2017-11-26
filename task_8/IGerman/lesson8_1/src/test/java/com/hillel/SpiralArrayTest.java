package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpiralArrayTest {

  public static void print(int[][] ar) {
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar[i].length; j++) {
        System.out.print(ar[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int sum(int[][] ar) {
    int sum = 0;
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar[i].length; j++) {
        sum += ar[i][j];
      }
    }
    return sum;
  }

  @Test
  public void shouldCountSpiralArray() {
    int[][] ar = SpiralArray.initArray(3, 2);
    int result = SpiralArrayTest.sum(ar);

    assertEquals(15, result);
  }

  @Test
  public void shouldCountSpiralArray2() {
    int[][] ar = SpiralArray.initArray(3, 4);
    int result = SpiralArrayTest.sum(ar);

    assertEquals(78, result);
  }

  @Test
  public void shouldCountSpiralArray3() {
    int[][] ar = SpiralArray.initArray(3, 5);
    SpiralArrayTest.print(ar);
  }

  @Test
  public void shouldCountSpiralArray4() {
    int[][] ar = SpiralArray.initArray(4, 4);
    SpiralArrayTest.print(ar);
  }

  @Test
  public void shouldCountSpiralArray5() {
    int[][] ar = SpiralArray.initArray(3, 3);
    SpiralArrayTest.print(ar);
  }
}
