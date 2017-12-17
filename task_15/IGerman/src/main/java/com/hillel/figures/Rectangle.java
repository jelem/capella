package com.hillel.figures;

public class Rectangle extends Figure {

  public double length;
  public double width;

  public Rectangle(double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }

  public double perimeter() {

    return 2 * (length + width);
  }

  public double square() {

    return length * width;

  }
}
