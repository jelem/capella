/**
 * Created by Andrew on 14.11.2017.
 */
public class Task7 {

  public static void main(String[] args) {
    int length = 5;
    int sum = 0;
    int average = 0;
    int[] array = new int[length];
    init(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
      sum += array[i];
    }
    average = sum / length;
    System.out.println();
    System.out.println("Arithmetical mean: " + average);
  }

  private static int[] init(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
  }
}
