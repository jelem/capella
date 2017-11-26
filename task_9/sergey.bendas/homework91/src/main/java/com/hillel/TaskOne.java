package com.hillel;

public class TaskOne {

  public static int[] uniteTwoArrays(int[] firstArray, int[] secondArray) {

    int lenFirst = firstArray.length;
    int lenSecond = secondArray.length;
    int lenResult = lenFirst + lenSecond;
    int[] resultArray = new int[lenResult];
    int posInFirstArray = 0;
    int posInSecondArray = 0;
    for (int i = 0; i < lenResult; i++) {
      if (posInFirstArray < lenFirst
          && (posInSecondArray >= lenSecond
          || firstArray[posInFirstArray] <= secondArray[posInSecondArray])) {
        resultArray[i] = firstArray[posInFirstArray];
        posInFirstArray++;
      } else {
        resultArray[i] = secondArray[posInSecondArray];
        posInSecondArray++;
      }
    }
    return resultArray;
  }
}
