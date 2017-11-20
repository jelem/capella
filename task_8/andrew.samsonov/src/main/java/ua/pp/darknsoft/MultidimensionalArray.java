package ua.pp.darknsoft;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Andrew on 20.11.2017.
 */
public class MultidimensionalArray {

  public static int[][] pasckalTriangle(int length) {
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

  public static int[][] spiral(int length) {
    int[][] helix = new int[length][length];

    return helix;
  }

}
