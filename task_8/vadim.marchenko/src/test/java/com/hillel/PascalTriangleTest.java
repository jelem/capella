package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PascalTriangleTest {

  @Test
  public void createPascalTriangle() {
    int[][] pascalTriangle = PascalTriangle.createPascalTriangle();
    assertEquals(pascalTriangle[2][2], 1);
    assertEquals(pascalTriangle[3][2], 3);
    assertEquals(pascalTriangle[4][2], 6);
  }
}