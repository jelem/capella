package com.hillel;

public class Numberhell {

  public static int sumOfNumbers(int numb) {

    int lastnumb = 0;
    int res = 0;
    do {
      lastnumb = numb % 10;
      res += lastnumb;
      numb /= 10;
    } while (numb > 0);
    return res;
  }

  public static int factorial(int numb) {
    int res = 1;
    if (numb == 0) {
      return 1;
    }
    else {
      for (int i = 1; i <= numb; i++) {
        res *= i;
      }
      return res;
    }
  }


  public static int triangleCalculation(int side, String formula) {

    int res = 0;
    switch (formula) {
      case "perimeter":
        res = side * 4;
        break;
      case "square":
        res = side * side;
        break;
      default:
    }
    return res;
  }
}
