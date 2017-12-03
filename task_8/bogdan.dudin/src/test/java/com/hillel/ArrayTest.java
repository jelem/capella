package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTest {

  @Test
  public void shouldCalculateSumOfElements() {
    int[] array = {1, 6, 15, 20, 15, 6, 1};

    int result = Array.sumOfElements(array);

    assertEquals(64, result);
  }
}
