package com.lev.FirstTask;

public class Rectangle extends Shape {

  private double vSide;
  private double hSide;

  public Rectangle(double vSide, double hSide) {
    this.vSide = vSide;
    this.hSide = hSide;
  }

  public double perimeter() {
    return 2 * (vSide + hSide);
  }

  public double square() {
    return Math.pow(vSide, 2);
  }
}