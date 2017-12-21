package com.hillel.first;

public class Square extends Figure {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double perimeter() {
    return side * 4;
  }

  @Override
  public double square() {
    return side * side;
  }
}
