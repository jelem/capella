package com.hillel;

public class FindSquare {

  public static int squareCalculation(int side, String formula) {

    switch (formula) {

      case "perimeter":
        side *= 4;
        break;
      case "square":
        side *= side;
        break;
      default:
        return 0;
    }

    return side;

  }

}
