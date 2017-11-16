/**
 * Created by Andrew on 14.11.2017.
 */
public class Task10 {

  public static void main(String[] args) {
    int length = 250;
    int number = 99;
    int[] array = new int[length];
    init(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    search(array, number);
  }

  private static int[] init(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
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


