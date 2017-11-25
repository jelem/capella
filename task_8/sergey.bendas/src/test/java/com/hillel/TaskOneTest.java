package com.hillel;

import org.junit.Assert;
import org.junit.Test;

public class TaskOneTest {

  @Test
  public void shouldFillPascalArrayOne() {

    int[][] result = TaskOne.fillPascalArray(1);
    int[][] testArray = {{1}};
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillPascalArrayTwo() {

    int[][] result = TaskOne.fillPascalArray(2);
    int[][] testArray = {{1}, {1, 1}};
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillPascalArrayFour() {

    int[][] result = TaskOne.fillPascalArray(4);
    int[][] testArray = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}};
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillPascalArraySeven() {

    int[][] result = TaskOne.fillPascalArray(7);
    int[][] testArray = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1},
        {1, 5, 10, 10, 5, 1}, {1, 6, 15, 20, 15, 6, 1}};
    Assert.assertArrayEquals(testArray, result);
  }
}
