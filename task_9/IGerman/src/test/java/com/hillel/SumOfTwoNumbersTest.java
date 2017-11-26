package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SumOfTwoNumbersTest {

  @Test
  public void shouldCheckIfArrayContainsSum() {

    int[] ar = {1, 3, 5, 6, 8, 9};
    boolean result = SumOfTwoNumbers.ifArrayContainsSum(ar, 4);

    assertThat(result, is(true));
  }

  @Test
  public void shouldCheckIfArrayContainsSum2() {

    int[] ar = {1, 3, 5, 6, 8, 9};
    boolean result = SumOfTwoNumbers.ifArrayContainsSum(ar, 13);

    assertThat(result, is(true));
  }
  
  @Test
  public void shouldCheckIfArrayContainsSum3() {

    int[] ar = {1, 3, 5, 6, 8, 9};
    boolean result = SumOfTwoNumbers.ifArrayContainsSum(ar, 18);

    assertThat(result, is(false));
  }
}