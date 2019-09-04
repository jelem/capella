package com.hillel;

public class Rectangle extends Figure {

  double verticalSide;
  double horizontalSide;

  public Rectangle(double verticalSide, double horizontalSide) {
    this.verticalSide = verticalSide;
    this.horizontalSide = horizontalSide;
  }

  @Override
  public double calculatePerimeter() {
    return (verticalSide + horizontalSide) * 2;
  }

  @Override
  public double calculateSquare() {
    return verticalSide * horizontalSide;
  }

}
