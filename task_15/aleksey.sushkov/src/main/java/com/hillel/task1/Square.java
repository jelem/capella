package com.hillel.task1;

public class Square extends Figure {

  private int side;

  public Square(int side) {
    this.side = side;
  }

  @Override
  public double square() {
    return side * side;
  }

  @Override
  public double perimeter() {
    return 4 * side;
  }

}
