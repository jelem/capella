package com.hillel;

import static com.hillel.Homework9.printArray;
import static com.hillel.Homework9.searchSumInArray;
import static com.hillel.Homework9.twoArrayToThirdAsc;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Homework9Test {

  @Test
  public void arraySecondBiggestFirst() {
    int[] first = {1, 3, 5};
    int[] second = {2, 4, 8, 9, 12};
    int[] third = {1, 2, 3, 4, 5, 8, 9, 12};

    int[] result = twoArrayToThirdAsc(first, second);

    assertArrayEquals(third, result);
  }

  @Test
  public void arrayFirstBiggestSecond() {
    int[] second = {1, 3, 5};
    int[] first = {2, 4, 8, 9, 12};
    int[] third = {1, 2, 3, 4, 5, 8, 9, 12};

    int[] result = twoArrayToThirdAsc(first, second);

    assertArrayEquals(third, result);
  }

  @Test
  public void arrayFirstEqualsSecond() {
    int[] second = {2, 4, 8, 9, 12};
    int[] first = {2, 4, 8, 9, 12};
    int[] third = {2, 2, 4, 4, 8, 8, 9, 9, 12, 12};

    int[] result = twoArrayToThirdAsc(first, second);

    assertArrayEquals(third, result);
  }

  @Test
  public void searchSumInArrayTestTrue() {
    int[] test = {1, 5, 7, 9, 12};

    boolean result = searchSumInArray(12, test);

    assertEquals(true, result);
  }

  @Test
  public void searchSumInArrayTestFalse() {
    int[] test = {1, 5, 7, 9, 12};

    boolean result = searchSumInArray(3, test);

    assertEquals(false, result);
  }
}
