package com.hillel;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Homework8Test {

  @Test
  public void shouldPascalTriangleFiveRow() {
    int[][] expectedResult = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
    int[][] result = com.hillel.PascalTriangle.arrayInput(5);
    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void shouldSpiralOdd() {
    int[][] expectedNine = {{1,2,3},{8,9,4},{7,6,5}};
    int[][] result = SpiralArray.arrayInit(9);
    result = SpiralArray.fillArraySpiral(result, 9);

    assertArrayEquals(expectedNine, result);
  }

  @Test
  public void shouldSpiralEven() {
    int[][] expectedSixteen = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
    int[][] result = SpiralArray.arrayInit(16);
    result = SpiralArray.fillArraySpiral(result, 16);
    assertArrayEquals(expectedSixteen, result);
  }

  @Test
  public void shouldSpiralSevenElemets() {
    int[][] expectedSeven = {{1,2,3},{0,0,4},{7,6,5}};
    int[][] result = SpiralArray.arrayInit(7);
    result = SpiralArray.fillArraySpiral(result, 7);
    assertArrayEquals(expectedSeven, result);
  }

}
