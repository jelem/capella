package com.hillel;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTest {

  @Test
  public void shouldCombineTwoArrays_1() {
    int[] arr1 = {1, 4, 4, 12, 43, 44, 96};
    int[] arr2 = {4, 8, 15, 16, 23, 42};
    int[] expectedArray = {1, 4, 4, 4, 8, 12, 15, 16, 23, 42, 43, 44, 96};

    int[] resultArray = Array.combine(arr1, arr2);

    assertArrayEquals(expectedArray, resultArray);
  }

  @Test
  public void shouldCombineTwoArrays_2() {
    int[] arr1 = {1, 3, 5};
    int[] arr2 = {2, 4, 8, 9, 12};
    int[] expectedArray = {1, 2, 3, 4, 5, 8, 9, 12};

    int[] resultArray = Array.combine(arr1, arr2);

    assertArrayEquals(expectedArray, resultArray);
  }

  @Test
  public void shouldReturnTrueIfExistSumOfElements_1() {
    int[] arr = {1, 2, 3, 4, 5, 8, 9, 12};

    boolean result = Array.sumOfTwoElementsExist(arr, 21);

    assertEquals(true, result);
  }

  @Test
  public void shouldReturnTrueIfExistSumOfElements_2() {
    int[] arr = {1, 2, 3, 4, 5, 8, 9, 12};

    boolean result = Array.sumOfTwoElementsExist(arr, 6);

    assertEquals(true, result);
  }

  @Test
  public void shouldReturnTrueIfExistSumOfElements_3() {
    int[] arr = {1, 2, 3, 4, 5, 8, 9, 12};

    boolean result = Array.sumOfTwoElementsExist(arr, 25);

    assertEquals(false, result);
  }
}
