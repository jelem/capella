import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BinarySearchTest {

  @Test
  public void shouldFindNumberInArray() {

    final int[] array = {2, 5, 7, 9, 12, 54, 67};
    final int number = 2;
    final int number1 = 5;
    final int number2 = 7;
    final int number3 = 9;
    final int number4 = 12;
    final int number5 = 54;
    final int number6 = 67;
    final int fake = 4;
    final int fake2 = 66;

    boolean result = BinarySearch.checkNumber(array, number);
    assertThat(result, is(true));
    boolean result1 = BinarySearch.checkNumber(array, number1);
    assertThat(result1, is(true));
    boolean result2 = BinarySearch.checkNumber(array, number2);
    assertThat(result2, is(true));
    boolean result3 = BinarySearch.checkNumber(array, number3);
    assertThat(result3, is(true));
    boolean result4 = BinarySearch.checkNumber(array, number4);
    assertThat(result4, is(true));
    boolean result5 = BinarySearch.checkNumber(array, number5);
    assertThat(result5, is(true));
    boolean result6 = BinarySearch.checkNumber(array, number6);
    assertThat(result6, is(true));
    boolean fakeResult = BinarySearch.checkNumber(array, fake);
    assertThat(fakeResult, is(false));
    boolean fakeResult2 = BinarySearch.checkNumber(array, fake2);
    assertThat(fakeResult2, is(false));
  }
}
