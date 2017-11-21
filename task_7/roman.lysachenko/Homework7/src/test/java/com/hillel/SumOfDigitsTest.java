package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {

  @Test
  public void shouldReturnSumOfDigits() {
    int number = 0;
    int sum = SumOfDigits.sumOfDigits(number);
    assertEquals(0, sum);
  }

  @Test
  public void shouldReturnSumOfDigits1() {
    int number = 1234;
    int sum = SumOfDigits.sumOfDigits(number);
    assertEquals(10, sum);
  }

  @Test
  public void shouldReturnSumOfDigits2() {
    int number = 999999;
    int sum = SumOfDigits.sumOfDigits(number);
    assertEquals(54, sum);
  }
}
