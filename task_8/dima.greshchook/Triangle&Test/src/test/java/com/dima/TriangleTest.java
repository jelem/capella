package com.dima;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
  private static int[][] EXPECTED_I = {
      {1}
  };

  private static int[][] EXPECTED_II = {
      {1},
      {1,1}
  };

  private static int[][] EXPECTED_III = {
      {1},
      {1,1},
      {1,2,1}
  };

  private static int[][] EXPECTED_IV = {
      {1},
      {1,1},
      {1,2,1},
      {1,3,3,1}
  };

  private static int[][] EXPECTED_V = {
      {1},
      {1,1},
      {1,2,1},
      {1,3,3,1},
      {1,4,6,4,1}
  };


  @Test
  public void test_1(){
    PascalTriangle pascalTriangle = new PascalTriangle(1);
    int[][] actual = pascalTriangle.getMatrix();


    assertEquals(EXPECTED_I,actual);
  }

  @Test
  public void test_2(){
    PascalTriangle pascalTriangle = new PascalTriangle(2);
    int[][] actual = pascalTriangle.getMatrix();


    assertEquals(EXPECTED_II,actual);
  }

  @Test
  public void test_3(){
    PascalTriangle pascalTriangle = new PascalTriangle(3);
    int[][] actual = pascalTriangle.getMatrix();


    assertEquals(EXPECTED_III,actual);
  }

  @Test
  public void test_4(){
    PascalTriangle pascalTriangle = new PascalTriangle(4);
    int[][] actual = pascalTriangle.getMatrix();


    assertEquals(EXPECTED_IV,actual);
  }

  @Test
  public void test_5(){
    PascalTriangle pascalTriangle = new PascalTriangle(5);
    int[][] actual = pascalTriangle.getMatrix();


    assertEquals(EXPECTED_V,actual);
  }
}
