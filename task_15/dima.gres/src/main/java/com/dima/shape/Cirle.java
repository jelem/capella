package com.dima.shape;

public class Cirle extends Shape {
  private double radius;



  public Cirle(double radius) {
    this.radius = radius;
  }

  @Override
  public double square() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2.0 * Math.PI * radius;
  }
}
