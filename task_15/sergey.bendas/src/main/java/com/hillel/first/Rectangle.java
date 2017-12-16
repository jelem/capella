package com.hillel.first;

public class Rectangle extends Figure {

  private double firstSide;
  private double secondSide;

  public Rectangle(double firstSide, double secondSide) {
    this.firstSide = firstSide;
    this.secondSide = secondSide;
  }

  @Override
  public double perimeter() {
    return (firstSide + secondSide) * 2;
  }

  @Override
  public double square() {
    return firstSide * secondSide;
  }
}
