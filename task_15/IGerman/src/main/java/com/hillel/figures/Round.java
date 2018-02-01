package com.hillel.figures;

public class Round extends Figure {

  public double radius;

  public Round(double radius) {
    super();
    this.radius = radius;
  }

  public double perimeter() {

    return 2 * Math.PI * radius;
  }

  public double square() {

    return Math.PI * Math.pow(radius, 2);
  }
}
