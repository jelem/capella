package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

  @Test
  public void factorialTest() {

    int sum = Factorial.factorialCount(5);
    assertEquals(120, sum);

  }

  @Test
  public void factorialTest2() {

    int sum = Factorial.factorialCount(7);
    assertEquals(5040, sum);

  }

  @Test
  public void factorialTest3() {

    int sum = Factorial.factorialCount(6);
    assertEquals(720, sum);

  }

}

