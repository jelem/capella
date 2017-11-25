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

  static int findElementAt(int lenCoord, int widthCoord, int len, int width) {

    return allElements(len, width)
        - insideArraySquare(lenCoord, widthCoord, len, width)
        - remainOfRound(lenCoord, widthCoord, len, width);
  }

  static int remainOfRound(int lenCoord, int widthCoord, int len, int width) {

    int border = findBorder(lenCoord, widthCoord, len, width);
    int right = 0;
    int top = 0;
    int left;
    int bottom = 0;
    switch (checkSide(lenCoord, widthCoord, len, width)) {
      case "top":
        top = width - widthCoord - 1 - (border - 1);
        right = len - 1 - 2 * (border - 1);
        bottom = width - 1 - 2 * (border - 1);
        left = len - 2 - 2 * (border - 1);
        break;
      case "right":
        right = len - lenCoord - 1 - (border - 1);
        bottom = width - 1 - 2 * (border - 1);
        left = len - 2 - 2 * (border - 1);
        break;
      case "bottom":
        bottom = widthCoord + 1 - border;
        left = len - 2 - 2 * (border - 1);
        break;
      case "left":
        left = lenCoord - border;
        break;
      default:
        return 0;
    }
    return left + top + right + bottom;
  }

  private static String checkSide(int lenCoord, int widthCoord, int len, int width) {
    int border = findBorder(lenCoord, widthCoord, len, width);
    if (lenCoord < border) {
      return "top";
    } else if (widthCoord >= width - border) {
      return "right";
    } else if (lenCoord >= len - border) {
      return "bottom";
    } else {
      return "left";
    }
  }

  static int insideArraySquare(int lenCoord, int widthCoord, int len, int width) {
    int border = findBorder(lenCoord, widthCoord, len, width);
    return (len - 2 * border) * (width - 2 * border);
  }

  static int findBorder(int lenCoord, int widthCoord, int len, int width) {
    int borderX = lenCoord < len / 2 ? lenCoord + 1 : len - lenCoord;
    int borderY = widthCoord < width / 2 ? widthCoord + 1 : width - widthCoord;
    return borderX < borderY ? borderX : borderY;
  }

  private static int allElements(int len, int width) {
    return len * width;
  }
}
