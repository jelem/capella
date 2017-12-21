package com.hillel;

public class Rectangle extends Figure {

  private int sideA;
  private int sideB;

  public Rectangle(int sideA, int sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  public int perimeter() {
    System.out.print("Rectangle perimeter= ");
    return sideA * 2 + sideB * 2;
  }

  public int square() {
    System.out.print("Rectangle square= ");
    return sideA * sideB;
  }
}
