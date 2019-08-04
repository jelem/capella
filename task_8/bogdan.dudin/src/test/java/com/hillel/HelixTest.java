package com.hillel;

import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.assertEquals;

public class HelixTest {

  @Test
  public void shouldBuildHelixArray() {
    int[][] helixArrayExpected = {
        {1, 2, 3, 4},
        {12, 13, 14, 5},
        {11, 16, 15, 6},
        {10, 9, 8, 7}
    };

    long start = System.nanoTime();
    int[][] helixArrayResult = Helix.build(5);
    long stop = System.nanoTime();
    System.out.println(stop - start);
    assertEquals(helixArrayExpected, helixArrayResult);
  }
}
