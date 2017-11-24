package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TechnologicalMergerTest {

  private static final int[] A_ARRAY = {1, 3, 5};
  private static final int[] B_ARRAY = {2, 4, 8, 9, 12};
  private static final int[] C_ARRAY = {1, 2, 3, 4, 5, 8, 9, 12};

  @Test
  public void shouldBeMarge() {
    int[] arrayAfterMerge = TechnologicalMerger.merge(A_ARRAY, B_ARRAY);
    assertThat(arrayAfterMerge, is(C_ARRAY));
  }
}
