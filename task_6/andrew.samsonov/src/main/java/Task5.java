/**
 * Created by Andrew on 14.11.2017.
 */
public class Task5 {

  public static void main(String[] args) {
    int length = 25;
    int[] array = new int[length];
    init(array);

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i] + " ");
      }

    }
  }

  private static int[] init(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
  }

}
