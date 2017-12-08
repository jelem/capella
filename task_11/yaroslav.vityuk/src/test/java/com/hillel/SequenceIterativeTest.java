package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SequenceIterativeTest {

  @Test
  public void shouldCountNumber() {
    int result = SequenceIterative.sequenceNumber(12);
    assertThat(result, is(355));
  }

  @Test
  public void shouldCountNumber2() {
    int result = SequenceIterative.sequenceNumber(8);
    assertThat(result, is(31));
  }

}
