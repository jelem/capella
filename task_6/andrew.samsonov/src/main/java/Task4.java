/**
 * Created by Andrew on 14.11.2017.
 */
public class Task4 {

  public static void main(String[] args) {
    int n = 25;
    int[] array = new int[n];
    init(array);

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0) {
        System.out.print(array[i] + " ");
      }

    }
  }

  private static int[] init(int[] ar) {
    for (int i = 0; i < ar.length; i++) {
      ar[i] = i + 1;
    }
    return ar;
  }

}
