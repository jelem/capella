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

  static int findElementAt(int iCoordinate, int jCoordinate, int len, int width) {

    return allElements(len, width)
        - insideArraySquare(iCoordinate, jCoordinate, len, width)
        - remainOfRound(iCoordinate, jCoordinate, len, width);
  }

  static int remainOfRound(int iCoordinate, int jCoordinate, int len, int width) {

    int border = findBorder(iCoordinate, jCoordinate, len, width);
    int right = 0;
    int top = 0;
    int left;
    int bottom = 0;
    switch (checkSide(iCoordinate, jCoordinate, len, width)) {
      case "top":
        top = width - jCoordinate - 1 - (border - 1);
        right = len - 1 - 2 * (border - 1);
        bottom = width - 1 - 2 * (border - 1);
        left = len - 2 - 2 * (border - 1);
        break;
      case "right":
        right = len - iCoordinate - 1 - (border - 1);
        bottom = width - 1 - 2 * (border - 1);
        left = len - 2 - 2 * (border - 1);
        break;
      case "bottom":
        bottom = jCoordinate + 1 - border;
        left = len - 2 - 2 * (border - 1);
        break;
      case "left":
        left = iCoordinate - border;
        break;
      default:
        return 0;
    }
    return left + top + right + bottom;
  }

  private static String checkSide(int iCoordinate, int jCoordinate, int len, int width) {
    int border = findBorder(iCoordinate, jCoordinate, len, width);
    if (iCoordinate < border) {
      return "top";
    } else if (jCoordinate >= width - border) {
      return "right";
    } else if (iCoordinate >= len - border) {
      return "bottom";
    } else {
      return "left";
    }
  }

  static int insideArraySquare(int iCoordinate, int jCoordinate, int len, int width) {
    int border = findBorder(iCoordinate, jCoordinate, len, width);
    return (len - 2 * border) * (width - 2 * border);
  }

  static int findBorder(int iCoordinate, int jCoordinate, int len, int width) {
    int borderX = iCoordinate < len / 2 ? iCoordinate + 1 : len - iCoordinate;
    int borderY = jCoordinate < width / 2 ? jCoordinate + 1 : width - jCoordinate;
    return borderX < borderY ? borderX : borderY;
  }

  private static int allElements(int len, int width) {
    return len * width;
  }
}
