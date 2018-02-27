package com.hillel.task1;

public class Rectangle extends Figure {

  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double square() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return 2 * length + 2 * width;
  }


}
