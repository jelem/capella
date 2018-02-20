package com.hillel.task1;

public class Circle extends Figure {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double square() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }

}
