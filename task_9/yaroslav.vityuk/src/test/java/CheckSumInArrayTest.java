import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CheckSumInArrayTest {

  @Test
  public void shouldCheckSumInArray() {
    int[] array = {1, 3, 5, 8, 12};
    int sum = 11;
    int sum1 = 15;
    int sum2 = 7;

    boolean result = CheckSumInArray.checkSum(array, sum);
    boolean result1 = CheckSumInArray.checkSum(array, sum1);
    boolean result2 = CheckSumInArray.checkSum(array, sum2);

    assertThat(result, is(true));
    assertThat(result1, is(true));
    assertThat(result2, is(false));

  }
}
