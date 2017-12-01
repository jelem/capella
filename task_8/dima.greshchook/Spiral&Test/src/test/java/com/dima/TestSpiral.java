package com.dima;

import com.dima.spiral.Spiral;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSpiral {
  private static int[][] SPIRAL_I = {
      {1}
  };

  private static int[][] SPIRAL_II = {
      {1,2},
      {4,3}
  };

  private static int[][] SPIRAL_III = {
      {1,2,3},
      {8,9,4},
      {7,6,5},
  };

  private static int[][] SPIRAL_IV = {
      {1,2,3,4},
      {12,13,14,5},
      {11,16,15,6},
      {10,9,8,7}
  };

  @Test
  public void testI(){
    Spiral spiral =new Spiral(1);
    int[][] actual = spiral.getMatrix();
    assertEquals(SPIRAL_I,actual);
  }

  @Test
  public void testII(){
    Spiral spiral =new Spiral(2);
    int[][] actual = spiral.getMatrix();
    assertEquals(SPIRAL_II,actual);
  }

  @Test
  public void testIII(){
    Spiral spiral =new Spiral(3);
    int[][] actual = spiral.getMatrix();
    assertEquals(SPIRAL_III,actual);
  }

  @Test
  public void testIV(){
    Spiral spiral =new Spiral(4);
    int[][] actual = spiral.getMatrix();
    assertEquals(SPIRAL_IV,actual);
  }
}
