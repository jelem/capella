import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoArraysInOneTest {

  @Test
  public void shouldConnectArrays() {

    final int[] firstArray = {1, 3, 5, 7};
    final int[] secondArray = {2, 4, 6, 10, 12, 15, 16, 20};
    final int[] checkResult = {1, 2, 3, 4, 5, 6, 7, 10, 12, 15, 16, 20};

    final int[] firstArray2 = {2, 3, 5, 7};
    final int[] secondArray2 = {1, 4, 6, 10};
    final int[] checkResult2 = {1, 2, 3, 4, 5, 6, 7, 10};

    final int[] result = TwoArraysInOne.pairing(firstArray, secondArray);
    assertArrayEquals(result, checkResult);

    final int[] result2 = TwoArraysInOne.pairing(firstArray2, secondArray2);
    assertArrayEquals(result2, checkResult2);
  }

}
