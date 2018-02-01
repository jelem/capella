package com.lev.task1;

public class Rectangle extends Shape {

  private double lengthSide;
  private double highSide;

  public Rectangle(double lengthSide, double highSide) {
    this.lengthSide = lengthSide;
    this.highSide = highSide;
  }

  public double perimeter() {
    return 2 * (lengthSide + highSide);
  }

  public double square() {
    return Math.pow(lengthSide, 2);
  }
}