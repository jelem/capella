package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BinarySearchTest {

  @Test
  public void testBinarySearch() {

    int[] ar = {1, 3, 5, 7, 9, 11, 13, 15};
    int number = 15;

    boolean result = BinarySearch.findNumberOptimized(ar, number);

    assertThat(result, is(true));
  }


  @Test
  public void testBinarySearch2() {

    int[] ar = {1, 3, 5, 7, 9, 11, 13, 15};
    int number = 16;

    boolean result = BinarySearch.findNumberOptimized(ar, number);

    assertThat(result, is(false));
  }

  @Test
  public void testBinarySearch3() {

    int[] ar = {1, 3, 5, 7, 9, 11, 13};
    int number = 1;

    boolean result = BinarySearch.findNumberOptimized(ar, number);

    assertThat(result, is(true));
  }


}
