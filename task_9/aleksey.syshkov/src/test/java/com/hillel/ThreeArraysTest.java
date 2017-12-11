package com.hillel;

import static com.hillel.ThreeArrays.SuperArray;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ThreeArraysTest {

  @Test
  public void IsArrayCorrect1() {
    int[] arr1 = {2, 5, 6, 7, 9, 13, 27};
    int[] arr2 = {0, 2, 4, 8};
    int[] res = SuperArray(arr1, arr2);
    assertArrayEquals(res, new int[]{0, 2, 2, 4, 5, 6, 7, 8, 9, 13, 27} );
  }

  @Test
  public void IsArrayCorrect2() {
    int[] arr1 = {5, 56, 74, 321, 1000, 1001};
    int[] arr2 = {0, 2, 5, 56, 321, 999, 1001, 2376};
    int[] res = SuperArray(arr1, arr2);
    assertArrayEquals(res, new int[]{0, 2, 5, 5, 56, 56, 74, 321, 321, 999, 1000, 1001, 1001, 2376} );
  }

}
