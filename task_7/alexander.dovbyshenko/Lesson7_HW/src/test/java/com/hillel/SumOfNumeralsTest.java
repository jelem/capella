package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNumeralsTest {

  @Test
  public void sumOfNumerals1() {

    int sum = SumOfNumerals.sumOfNumbers(123456);
    assertEquals(21, sum);

  }

  @Test
  public void sumOfNumerals2() {

    int sum = SumOfNumerals.sumOfNumbers(7601635);
    assertEquals(28, sum);

  }

  @Test
  public void sumOfNumerals4() {

    int sum = SumOfNumerals.sumOfNumbers(7776764);
    assertEquals(44, sum);

  }

}
