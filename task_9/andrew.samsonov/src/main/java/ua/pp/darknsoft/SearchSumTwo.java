package ua.pp.darknsoft;

public class SearchSumTwo {

  public static boolean lookFor(int sum, int[] array) {
    int checkNumberOfIterations = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        checkNumberOfIterations++;
        if (array[j] > sum - array[i]) {
          break;
        }
        if (array[i] + array[j] == sum) {
          System.out.println("The number of iterations: " + checkNumberOfIterations);
          return true;
        }
      }
    }
    System.out.println("The number of iterations: " + checkNumberOfIterations);
    return false;
  }

}
