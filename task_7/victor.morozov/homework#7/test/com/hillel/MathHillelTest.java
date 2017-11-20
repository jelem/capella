package com.hillel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MathHillelTest {

  @Test
  public void shouldSumDigits () {
    int result = MathHillel.sumDigitsOfNumbers(123543);
    assertEquals(18, result);
  }

  @Test
  public void shouldSumDigitsNegative () {
    int result = MathHillel.sumDigitsOfNumbers(-123543);
    assertEquals(18, result);
  }

  @Test
  public void shouldSumDigitsZero () {
    int result = MathHillel.sumDigitsOfNumbers(0);
    assertEquals(0, result);
  }

  @Test
  public void shouldFactorial () {
    long result = MathHillel.factorial(5);
    assertEquals(120, result);
  }

  @Test
  public void shouldFactorialZero () {
    long result = MathHillel.factorial(0);
    assertEquals(1, result);
  }

  @Test
  public void shouldFactorialNegative () {
    long result = MathHillel.factorial(-5);
    assertEquals(-1, result);
  }

  @Test
  public void shouldTriangleCalculationPerimeter() {
    long result = MathHillel.triangleCalculation(5, "perimeter");
    assertEquals(20, result);
  }

  @Test
  public void shouldTriangleCalculationSquare() {
    long result = MathHillel.triangleCalculation(5, "square");
    assertEquals(25, result);
  }

  @Test
  public void shouldTriangleCalculationFail() {
    long result = MathHillel.triangleCalculation(5, "abc");
    assertEquals(0, result);
  }
}
