/**
 * Created by Andrew on 14.11.2017.
 */
public class Task8 {

  public static void main(String[] args) {
    int length = 25;
    int[] array = new int[length];
    init(array);
    int min = array[0];
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
      if (min > array[i]) {
        min = array[i];
      }
      if (max < array[i]) {
        max = array[i];
      }
    }
    System.out.println();
    System.out.println("min + max = " + (min + max));

  }

  private static int[] init(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
  }

}
