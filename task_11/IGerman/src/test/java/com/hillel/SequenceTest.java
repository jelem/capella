package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SequenceTest {

  @Test
  public void shouldFindAMember() {

    int result = Sequence.sequenceMember(7);

    assertThat(result, is(17));

  }

  @Test
  public void shouldFindAMember2() {

    int result = Sequence.sequenceMember(3);

    assertThat(result, is(1));

  }
}
