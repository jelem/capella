package com.hillel.first;

public class Circle extends Figure {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double square() {
    return Math.PI * radius * radius;
  }
}
