package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindSquareTest {

  @Test
  public void calculateSides() {

    int side = FindSquare.squareCalculation(4, "perimeter");
    assertEquals(16, side);

  }

  @Test
  public void calculateSides1() {

    int side = FindSquare.squareCalculation(4, "square");
    assertEquals(16, side);

  }

  @Test
  public void calculateSides2() {

    int side = FindSquare.squareCalculation(7, "perimeter");
    assertEquals(28, side);

  }

  @Test
  public void calculateSides4() {

    int side = FindSquare.squareCalculation(8, "square");
    assertEquals(64, side);

  }

  @Test
  public void calculateSides5(){

    int side = FindSquare.squareCalculation(4, "perimeters");
    assertEquals(0, side);

  }

}
