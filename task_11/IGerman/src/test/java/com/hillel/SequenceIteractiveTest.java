package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SequenceIteractiveTest {

  @Test
  public void shouldFindAMember() {

    int result = SequenceIteractive.sequenceMember(7);

    assertThat(result, is(17));

  }

  @Test
  public void shouldFindAMember2() {

    int result = SequenceIteractive.sequenceMember(3);

    assertThat(result, is(1));

  }
}
