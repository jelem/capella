package com.dima.shape;

public class Triangle extends Shape {
  private double first;
  private double second;
  private double third;

  public Triangle(double first, double second, double third) {
    super();
    this.first = first;
    this.second = second;
    this.third = third;
  }

  @Override
  public double square() {

    double halfOfPer = perimeter() / 2.0;
    return Math.sqrt(halfOfPer * (halfOfPer - first) * (halfOfPer - third));
  }

  @Override
  public double perimeter() {
    return first + second + third;
  }
}
