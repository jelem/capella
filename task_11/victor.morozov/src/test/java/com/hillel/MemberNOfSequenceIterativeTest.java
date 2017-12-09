package com.hillel;

import static com.hillel.MemberNOfSequenceIterative.memberNOfSequenceIterative;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class MemberNOfSequenceIterativeTest {

  @Test
  public void memberOfNSequenceIterativeTest() {
    int result = memberNOfSequenceIterative(10);
    assertThat(result, is(105));
  }

}
