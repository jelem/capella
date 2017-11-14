/**
 * Created by Andrew on 14.11.2017.
 */
public class Task7 {

  public static void main(String[] args) {
    int n = 5;
    int sum = 0;
    int average = 0;
    int[] array = new int[n];
    init(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
      sum += array[i];
    }
    average = sum / n;
    System.out.println();
    System.out.println("Arithmetical mean: " + average);
  }

  private static int[] init(int[] ar) {
    for (int i = 0; i < ar.length; i++) {
      ar[i] = i + 1;
    }
    return ar;
  }
}
