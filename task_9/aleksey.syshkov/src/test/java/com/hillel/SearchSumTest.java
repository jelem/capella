package com.hillel;

import static com.hillel.SearchSum.seeker;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchSumTest {

  @Test
  public void IsArrayCorrect1() {
    int[] arr = {2, 4, 6, 7, 9, 13, 27};
    int neededsum = 19;
    boolean res = seeker(arr, neededsum);
    assertTrue(res);
  }

  @Test
  public void IsArrayCorrect2() {
    int[] arr = {0, 3, 4, 7, 116, 144, 227, 341, 343};
    int neededsum = 684;
    boolean res = seeker(arr, neededsum);
    assertTrue(res);
  }
}