package com.dima.shape;

public class Main {

  public static void main(String[] args) {

    Shape[] shapes = {
        new Cirle(10),
        new Triangle(3, 4, 5),
        new Rectangle(5, 10),
        new Triangle(12, 12, 12)
    };
    for (Shape current : shapes) {
      System.out.println(" Perimetr of this shape: " + current.perimeter() );
      System.out.println(" Square of this shape: " + current.square() );
      System.out.println();
    }
  }
}
