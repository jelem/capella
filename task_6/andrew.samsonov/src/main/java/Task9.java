/**
 * Created by Andrew on 14.11.2017.
 */
public class Task9 {

  public static void main(String[] args) {
    int length = 7;
    int[] array = new int[length];
    init(array);
    int multiplication = 1;

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
      if ( array[i] % 2 != 0) {
        multiplication *= array[i];
      }

    }
    System.out.println();
    System.out.println("Multiplication: " + multiplication);
  }

  private static int[] init(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
  }

}
