package com.hillel;

public class Circle extends Figure {

  double radius;
  final double phi = 3.14;

  public Circle(double radius) {
    this.radius = radius;
  }


  @Override
  public double calculatePerimeter() {
    return 2 * (radius * phi);
  }

  @Override
  public double calculateSquare() {
    return phi * (radius * radius);
  }

}
