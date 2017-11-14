/**
 * Created by Andrew on 14.11.2017.
 */
public class Task10 {

  public static void main(String[] args) {
    int length = 250;
    int n = 99;
    int[] array = new int[length];
    init(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    search(array, n);
  }

  private static int[] init(int[] ar) {
    for (int i = 0; i < ar.length; i++) {
      ar[i] = i + 1;
    }
    return ar;
  }

  private static void search(int[] array, int n) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        System.out.println();
        System.out.print(array[i] + " in the " + i +" position");
        return;
      }
    }
    System.out.println();
    System.out.print(n + " doesn\'t exist");
  }

}


