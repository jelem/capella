package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

  @Test
  public void shouldReturnFactorial() {
    int number = 0;
    int factorial = Factorial.factorial(number);
    assertEquals(0, factorial);
  }

  @Test
  public void shouldReturnFactorial1() {
    int number = 6;
    int factorial = Factorial.factorial(number);
    assertEquals(720, factorial);
  }

  @Test
  public void shouldReturnFactorial2() {
    int number = 10;
    int factorial = Factorial.factorial(number);
    assertEquals(3628800, factorial);
  }

}