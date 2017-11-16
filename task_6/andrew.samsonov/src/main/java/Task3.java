/**
 * Created by Andrew on 14.11.2017.
 */
public class Task3 {

  public static void main(String[] args) {
    int length = 9;
    int[] array = new int[length];
    initReverse(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  private static int[] initReverse(int[] array) {
    for (int i = 0, j = array.length; i < array.length; i++, j--) {
      array[i] = j;
    }
    return array;
  }

}
