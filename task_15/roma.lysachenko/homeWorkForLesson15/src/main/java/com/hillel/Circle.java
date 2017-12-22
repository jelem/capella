package com.hillel;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculatePerimeter() {
    return Math.PI * 2 * radius;
  }

  @Override
  public double calculateSquare() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public String toString() {
    return "circle";
  }
}
