package com.hillel;

public class Main {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Square(5);
    shapes[1] = new Rectangle(10, 5);
    shapes[2] = new Circle(10);

    for (Shape shape : shapes) {
      if (shapes != null) {
        System.out.println("\nPerimeter " + shape.toString() + " = " + shape.calculatePerimeter());
        System.out.println("Square  " + shape.toString() + " = " + shape.calculateSquare());
      }
    }
  }

}
