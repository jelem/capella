package com.lev.task1;

public class Square extends Shape {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double perimeter() {
    return 4 * side;
  }

  public double square() {
    return Math.pow(side, 2);
  }
}