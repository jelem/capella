package com.hillel;

public class Square extends Shape {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double calculatePerimeter() {
    return side * 4;
  }

  @Override
  public double calculateSquare() {
    return side * side;
  }

  @Override
  public String toString() {
    return "square";
  }
}

