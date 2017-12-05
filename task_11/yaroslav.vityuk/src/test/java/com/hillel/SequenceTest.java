package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SequenceTest {

  @Test
  public void shouldCountNumber() {
    int result = Sequence.recursionSequenceNumber(8);
    assertThat(result, is(31));
  }

  @Test
  public void shouldCountNumber2() {
    int result = Sequence.recursionSequenceNumber(9);
    assertThat(result, is(57));
  }

}
