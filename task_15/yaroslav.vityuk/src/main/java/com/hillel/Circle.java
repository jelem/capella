package com.hillel;

public class Circle extends Figure {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int perimeter() {
    System.out.print("Circle perimeter= ");
    return 2 * (int) (Math.PI) * radius;
  }

  public int square() {
    System.out.print("Circle square= ");
    return (int) (Math.PI) * radius * radius;
  }

}
