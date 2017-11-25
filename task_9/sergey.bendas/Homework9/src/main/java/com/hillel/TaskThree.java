package com.hillel;

public class TaskThree {

  public static boolean isSumInArray1(int number, int[] array) {
    int indexOfValue = indexOfMaxPossibleValue(number, array);
    for (int i = 0; i < indexOfValue; i++) {
      for (int j = i; j < indexOfValue; j++) {
        if (array[i] + array[j + 1] == number) {
          return true;
        }
      }
    }
    return false;
  }

  static int indexOfMaxPossibleValue(int value, int[] array) {
    int index = 0;
    while (index < array.length && array[index] <= value - array[0]) {
      index++;
    }
    return --index;
  }
}
