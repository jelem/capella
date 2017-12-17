package com.hillel.figures;

public class Square extends Figure {

  public double length;

  public Square(double length) {
    super();
    this.length = length;
  }

  public double perimeter() {

    return 4 * length;
  }

  public double square() {

    return Math.pow(length, 2);
  }
}
