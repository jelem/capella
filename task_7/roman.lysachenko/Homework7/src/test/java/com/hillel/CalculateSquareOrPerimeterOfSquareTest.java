package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateSquareOrPerimeterOfSquareTest {

  @Test
  public void shouldReturnSquareOfSquare() {
    int side = 5;
    String formula = "square";
    int result = CalculateSquareOrPerimeterOfSquare.triangleCalculation(side, formula);
    assertEquals(25, result);
  }

  @Test
  public void shouldReturnPerimeterOfSquare() {
    int side = 5;
    String formula = "perimeter";
    int result = CalculateSquareOrPerimeterOfSquare.triangleCalculation(side, formula);
    assertEquals(20, result);
  }

  @Test
  public void shouldReturnZero() {
    int side = 5;
    String formula = "perimeterrewfd";
    int result = CalculateSquareOrPerimeterOfSquare.triangleCalculation(side, formula);
    assertEquals(0, result);
  }

}