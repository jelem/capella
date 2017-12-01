package com.hillel;

public class CalculateSquareOrPerimeterOfSquare {

  public static int triangleCalculation(int side, String formula) {

    switch (formula) {
      case "square":
        return side * side;

      case "perimeter":
        return side * 4;

      default:
        return 0;
    }
  }

}
