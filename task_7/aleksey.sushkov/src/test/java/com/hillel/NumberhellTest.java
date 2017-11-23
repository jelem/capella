package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberhellTest {

  @Test
  public void shouldSumOfNumbers1() {
    int result = Numberhell.sumOfNumbers(123453);
    assertEquals(18, result);
  }

  @Test
  public void shouldSumOfNumbers2() {
    int result = Numberhell.sumOfNumbers(5683084);
    assertEquals(34, result);
  }

  @Test
  public void shouldSumOfNumbers3() {
    int result = Numberhell.sumOfNumbers(2);
    assertEquals(2, result);
  }

  @Test
  public void shouldFactorial1() {
    int result = Numberhell.factorial(5);
    assertEquals(120, result);
  }

  @Test
  public void shouldFactorial2() {
    int result = Numberhell.factorial(12);
    assertEquals(479001600, result);
  }

  @Test
  public void shouldFactorial3() {
    int result = Numberhell.factorial(0);
    assertEquals(1, result);
  }

  @Test
  public void shouldTriangle1() {
    int result = Numberhell.triangleCalculation(5,"perimeter");
    assertEquals(20, result);
  }

  @Test
  public void shouldTriangle2() {
    int result = Numberhell.triangleCalculation(26,"square");
    assertEquals(676, result);
  }

  @Test
  public void shouldTriangle3() {
    int result = Numberhell.triangleCalculation(11,"wrong_parameter");
    assertEquals(0, result);
  }
}
