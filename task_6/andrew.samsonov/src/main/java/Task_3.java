/**
 * Created by Andrew on 14.11.2017.
 */
public class Task_3 {

  public static void main(String[] args) {
    int n = 9;
    int[] array = new int[n];
    initReverse(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  private static int[] initReverse(int[] ar) {
    for (int i = 0, j = ar.length; i < ar.length; i++, j--) {
      ar[i] = j;
    }
    return ar;
  }

}
