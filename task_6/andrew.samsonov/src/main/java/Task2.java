/**
 * Created by Andrew on 14.11.2017.
 */
public class Task2 {

  public static void main(String[] args) {
    int n = 25;
    int[] array = new int[n];
    init(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  private static int[] init(int[] ar) {
    for (int i = 0; i < ar.length; i++) {
      ar[i] = i+1;
    }
    return ar;
  }

}
