package com.hillel;

public class Square extends Figure {

  double sideLength;

  public Square(double sideLength) {
    this.sideLength = sideLength;
  }


  @Override
  public double calculatePerimeter() {
    return sideLength * 4;
  }

  @Override
  public double calculateSquare() {
    return sideLength * sideLength;
  }

}
