package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceTest {

  @Test
  public void sequenceIterativeTest_1() {
    int result = Sequence.iterative(7);

    assertEquals(17, result);
  }

  @Test
  public void sequenceIterativeTest_2() {
    int result = Sequence.iterative(0);

    assertEquals(0, result);
  }

  @Test
  public void sequenceIterativeTest_3() {
    int result = Sequence.iterative(10);

    assertEquals(105, result);
  }

  @Test
  public void sequenceIterativeTest_4() {
    int result = Sequence.iterative(2);

    assertEquals(1, result);
  }


  @Test
  public void sequenceRecursiveTest_1() {
    int result = Sequence.recursive(7);

    assertEquals(17, result);
  }

  @Test
  public void sequenceRecursiveTest_2() {
    int result = Sequence.recursive(0);

    assertEquals(0, result);
  }

  @Test
  public void sequenceRecursiveTest_3() {
    int result = Sequence.recursive(10);

    assertEquals(105, result);
  }

  @Test
  public void sequenceRecursiveTest_4() {
    int result = Sequence.recursive(2);

    assertEquals(1, result);
  }
}