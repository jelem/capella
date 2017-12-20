package com.lev.FirstTask;

public class Square extends Shape {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double perimeter() {
    return 4 * side;
  }

  public double square() {
    return side * side;
  }
}