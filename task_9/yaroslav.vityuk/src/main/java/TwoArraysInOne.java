public class TwoArraysInOne {

  public static int[] pairing(int[] firstArray, int[] secondArray) {
    int[] overallArray = new int[firstArray.length + secondArray.length];

    for (int j = 0, i = 0; j < overallArray.length; i++) {

      if (i < firstArray.length) {
        if (secondArray[i] < firstArray[i]) {
          overallArray[j] = secondArray[i];
          overallArray[j + 1] = firstArray[i];
        } else {
          overallArray[j] = firstArray[i];
          overallArray[j + 1] = secondArray[i];
        }
        j += 2;
      } else {
        overallArray[j] = secondArray[i];
        j++;
      }
    }

    return overallArray;
  }
}
