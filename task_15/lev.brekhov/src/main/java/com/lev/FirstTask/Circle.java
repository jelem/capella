package com.lev.FirstTask;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  public double square() {
    return Math.PI * Math.pow(radius, 2);
  }
}