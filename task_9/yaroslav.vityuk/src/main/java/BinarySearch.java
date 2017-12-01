public class BinarySearch {

  public static boolean checkNumber(int[] array, int number) {

    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int middle = (start + end) >>> 1;
      if (number == array[middle]) {
        return true;
      }
      if (array[middle] < number) {
        start = middle + 1;
      } else {
        end = middle - 1;
      }
    }
    return false;
  }
}