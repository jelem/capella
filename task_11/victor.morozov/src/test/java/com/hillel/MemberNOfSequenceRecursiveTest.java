package com.hillel;

import static com.hillel.MemberNOfSequenceRecursive.memberNOfSequence;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class MemberNOfSequenceRecursiveTest {

  @Test
  public void memberOfNSequenceTest() {
    int result = memberNOfSequence(10);
    assertThat(result, is(105));
  }

}
