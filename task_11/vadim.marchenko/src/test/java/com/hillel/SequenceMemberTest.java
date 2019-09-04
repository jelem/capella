package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SequenceMemberTest {

  @Test
  public void sequenceMemberFunctionalTest() {
    Assert.assertEquals(SequenceMember.sequenceMemberFunctional(4), 3);
    Assert.assertEquals(SequenceMember.sequenceMemberFunctional(5), 5);
    Assert.assertEquals(SequenceMember.sequenceMemberFunctional(6), 9);
    Assert.assertEquals(SequenceMember.sequenceMemberFunctional(7), 17);
  }

  @Test
  public void sequenceMemberIterativeTest() {
    Assert.assertEquals(SequenceMember.sequenceMemberIterative(4), 3);
    Assert.assertEquals(SequenceMember.sequenceMemberIterative(5), 5);
    Assert.assertEquals(SequenceMember.sequenceMemberIterative(6), 9);
    Assert.assertEquals(SequenceMember.sequenceMemberIterative(7), 17);
  }

}