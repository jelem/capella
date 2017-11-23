package com.hillel;

public class TaskOne {

  public static int[][] fillPascalArray(int len) {
    int[][] pascalArray = new int[len][];
    pascalArray[0] = new int[]{1};
    for (int i = 1; i < pascalArray.length; i++) {
      pascalArray[i] = nextPascalLine(pascalArray[i - 1]);
    }
    return pascalArray;
  }

  private static int[] nextPascalLine(int[] previousLine) {
    int len = previousLine.length + 1;
    int[] nextLine = new int[len];
    nextLine[0] = 1;
    nextLine[len - 1] = 1;
    for (int i = 1; i < len - 1; i++) {
      nextLine[i] = previousLine[i - 1] + previousLine[i];
    }
    return nextLine;
  }
}
