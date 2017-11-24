package ua.pp.darknsoft;

public class MultidimensionalArray {

  public static int[][] pascalTriangle(int length) {
    int[][] autoPascal = new int[length][];

    for (int i = 0; i < autoPascal.length; i++) {
      int[] innerArray = new int[i + 1];
      autoPascal[i] = innerArray;
      if (i > 0) {
        for (int j = 0; j < autoPascal[i].length; j++) {
          if (j > 0 && j < autoPascal[i].length - 1) {
            innerArray[j] = autoPascal[i - 1][j] + autoPascal[i - 1][j - 1];
          } else {
            innerArray[j] = 1;
          }
        }
      } else {
        innerArray[i] = 1;
      }
    }

    return autoPascal;
  }

  public static int[][] helixInit(int length) {
    if (length <= 0) {
      return new int[0][0];
    }
    int[][] helix = new int[length][length];
    int x1 = 0;
    int y1 = length - 1;
    int x2 = length - 1;
    int y2 = 0;
    int tmp = 1;
    int steps = 0;
    if (length % 2 == 0) {
      steps = length / 2;
    } else {
      steps = (length / 2) + 1;
    }
    for (int k = 0; k < steps; k++) {

      for (int i = x1; i <= y1; i++) {
        for (int j = y2; j <= y1; j++) {

          if (i != x1 && j != y1) {
            helix[i][j] = 0;
          } else {
            helix[i][j] = tmp;
            tmp++;
          }
        }
      }
      y1--;
      x1++;
      for (int i = x2; i >= x1; i--) {
        for (int j = y1; j >= y2; j--) {
          if (i != x2 && j != y2) {
            helix[i][j] = 0;
          } else {
            helix[i][j] = tmp;
            tmp++;

          }
        }
      }
      x2--;
      y2++;
    }

    return helix;
  }

}
