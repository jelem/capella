package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SequenceClassTest {

  private static final int MEMBER_2 = 1;
  private static final int MEMBER_9 = 57;
  private static final int MEMBER_8 = 31;
  private static final int MEMBER_7 = 17;


  @Test
  public void testSequenceByRecursiveMethod1() {
    int testData = SequenceClass.sequenceByRecursiveMethod(9);
    assertThat(testData, is(MEMBER_9));
  }

  @Test
  public void testSequenceByIterationMethod1() {
    int testData = SequenceClass.sequenceByIterationMethod(9);
    assertThat(testData, is(MEMBER_9));
  }

  @Test
  public void testSequenceByRecursiveMethod2() {
    int testData = SequenceClass.sequenceByRecursiveMethod(8);
    assertThat(testData, is(MEMBER_8));
  }

  @Test
  public void testSequenceByIterationMethod2() {
    int testData = SequenceClass.sequenceByIterationMethod(8);
    assertThat(testData, is(MEMBER_8));
  }

  @Test
  public void testSequenceByRecursiveMethod3() {
    int testData = SequenceClass.sequenceByRecursiveMethod(7);
    assertThat(testData, is(MEMBER_7));
  }

  @Test
  public void testSequenceByIterationMethod3() {
    int testData = SequenceClass.sequenceByIterationMethod(7);
    assertThat(testData, is(MEMBER_7));
  }

  @Test
  public void testSequenceByRecursiveMethod4() {
    int testData = SequenceClass.sequenceByRecursiveMethod(2);
    assertThat(testData, is(MEMBER_2));
  }

  @Test
  public void testSequenceByIterationMethod4() {
    int testData = SequenceClass.sequenceByIterationMethod(2);
    assertThat(testData, is(MEMBER_2));
  }
}
