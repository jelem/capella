package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SearchSumTwoTest {

  private static final int[] A_ARRAY = {1, 5, 7, 9, 12};
  private static final int[] B_ARRAY = {3, 4, 5, 8, 9, 12};
  private static final int[] C_ARRAY = {1, 8, 9, 9, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22, 23};

  @Test
  public void shootBeSummarized_A() {
    boolean bool = SearchSumTwo.lookFor(12, A_ARRAY);
    assertThat(true, is(bool));
  }

  @Test
  public void shootBeSummarized_B() {
    boolean bool = SearchSumTwo.lookFor(10, B_ARRAY);
    assertThat(false, is(bool));
  }

  @Test
  public void shootBeSummarized_C() {
    boolean bool = SearchSumTwo.lookFor(18, C_ARRAY);
    assertThat(true, is(bool));
  }
}
