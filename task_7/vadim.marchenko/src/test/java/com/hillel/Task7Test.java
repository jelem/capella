package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Task7Test {

  @Test
  public void shouldAddDigitsTest() {
    assertEquals(Task7.addDigits(421), 7);
    assertEquals(Task7.addDigits(999999), 54);
    assertEquals(Task7.addDigits(1), 1);
    assertEquals(Task7.addDigits(0), 0);
  }

  @Test
  public void shouldCalculateFactorialTest() {
    assertEquals(Task7.numberFactorial(5), 120);
    assertEquals(Task7.numberFactorial(6), 720);
    assertEquals(Task7.numberFactorial(7), 5040);
    assertEquals(Task7.numberFactorial(1), 1);
  }

  @Test
  public void shouldCalculateSquareFormulas() {
    assertEquals(Task7.triangleCalculation(5, "perimeter"), 20);
    assertEquals(Task7.triangleCalculation(5, "square"), 25);
    assertEquals(Task7.triangleCalculation(5, "SomethingElse"), 0);
  }
}