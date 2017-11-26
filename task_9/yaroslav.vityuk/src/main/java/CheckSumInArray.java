import java.util.Arrays;

public class CheckSumInArray {

  public static boolean checkSum(int[] array, int sum) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == sum) {
          return true;
        }
      }
    }
    return false;
  }

}
