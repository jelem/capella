package com.dima.shape;

public class Rectangle extends Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double square() {
    return width * length;
  }

  @Override
  public double perimeter() {
    return 2 * (width + length);
  }
}
