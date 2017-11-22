package com.hillel;

import org.junit.Assert;
import org.junit.Test;

public class TaskTwoTest {

  @Test
  public void shouldFillSpiralArray() {
    int[][] result = TaskTwo.fillSpiralArray(5, 5);
    int[][] testArray = {
        {1, 2, 3, 4, 5},
        {16, 17, 18, 19, 6},
        {15, 24, 25, 20, 7},
        {14, 23, 22, 21, 8},
        {13, 12, 11, 10, 9}
    };
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillSpiralArray2() {
    int[][] result = TaskTwo.fillSpiralArray(1, 1);
    int[][] testArray = {{1}};
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillSpiralArray3() {
    int[][] result = TaskTwo.fillSpiralArray(1, 2);
    int[][] testArray = {{1, 2}};
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillSpiralArray4() {
    int[][] result = TaskTwo.fillSpiralArray(2, 2);
    int[][] testArray = {
        {1, 2},
        {4, 3}
    };
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldFillSpiralArray5() {
    int[][] result = TaskTwo.fillSpiralArray(6, 13);
    int[][] testArray = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
        {34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 14},
        {33, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 46, 15},
        {32, 59, 78, 77, 76, 75, 74, 73, 72, 71, 70, 47, 16},
        {31, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 17},
        {30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18}
    };
    Assert.assertArrayEquals(testArray, result);
  }

  @Test
  public void shouldInsideArraySquare() {
    int result = TaskTwo.insideArraySquare(0, 0, 5, 5);
    Assert.assertEquals(9, result);
  }

  @Test
  public void shouldInsideArraySquare2() {
    int result = TaskTwo.insideArraySquare(0, 2, 5, 5);
    Assert.assertEquals(9, result);
  }

  @Test
  public void shouldBorder() {
    int result = TaskTwo.findBorder(2, 3, 5, 5);
    Assert.assertEquals(2, result);
  }

  @Test
  public void shouldBorder2() {
    int result = TaskTwo.findBorder(0, 2, 5, 5);
    Assert.assertEquals(1, result);
  }

  @Test
  public void shouldLeftPerimeter() {
    int result = TaskTwo.remainOfRound(0, 0, 5, 5);
    Assert.assertEquals(15, result);
  }

  @Test
  public void shouldLeftPerimeter2() {
    int result = TaskTwo.remainOfRound(0, 2, 5, 5);
    Assert.assertEquals(13, result);
  }

  @Test
  public void shouldLeftPerimeter3() {
    int result = TaskTwo.remainOfRound(1, 1, 5, 5);
    Assert.assertEquals(7, result);
  }
}
