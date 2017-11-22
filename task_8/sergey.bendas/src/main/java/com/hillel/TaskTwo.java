package com.hillel;

public class TaskTwo {

  public static int[][] fillSpiralArray(int len, int width) {

    int[][] spiralArray = new int[len][width];

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < width; j++) {
        spiralArray[i][j] = findElementAt(i, j, len, width);
      }
    }
    return spiralArray;
  }

  static int findElementAt(int i, int j, int len, int width) {

    return allElements(len, width)
        - insideArraySquare(i, j, len, width)
        - remainOfRound(i, j, len, width);
  }

  static int remainOfRound(int i, int j, int len, int width) {

    int border = findBorder(i, j, len, width);
    int right = 0;
    int top = 0;
    int left;
    int bottom = 0;
    switch (checkSide(i, j, len, width)) {
      case "top":
        top = width - j - 1 - (border - 1);
        right = len - 1 - 2 * (border - 1);
        bottom = width - 1 - 2 * (border - 1);
        left = len - 2 - 2 * (border - 1);
        break;
      case "right":
        right = len - i - 1 - (border - 1);
        bottom = width - 1 - 2 * (border - 1);
        left = len - 2 - 2 * (border - 1);
        break;
      case "bottom":
        bottom = j + 1 - border;
        left = len - 2 - 2 * (border - 1);
        break;
      case "left":
        left = i - border;
        break;
      default:
        return 0;
    }
    return left + top + right + bottom;
  }

  private static String checkSide(int i, int j, int len, int width) {
    int border = findBorder(i, j, len, width);
    if (i < border) {
      return "top";
    } else if (j >= width - border) {
      return "right";
    } else if (i >= len - border) {
      return "bottom";
    } else {
      return "left";
    }
  }

  static int insideArraySquare(int i, int j, int len, int width) {
    int border = findBorder(i, j, len, width);
    return (len - 2 * border) * (width - 2 * border);
  }

  static int findBorder(int i, int j, int len, int width) {
    int borderX = i < len / 2 ? i + 1 : len - i;
    int borderY = j < width / 2 ? j + 1 : width - j;
    return borderX < borderY ? borderX : borderY;
  }

  private static int allElements(int len, int width) {
    return len * width;
  }
}
