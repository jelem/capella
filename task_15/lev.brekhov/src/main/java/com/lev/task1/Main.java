package com.lev.task1;

public class Main {

  public static void main(String[] args) {

    Shape rectangle = new Rectangle(4.0, 10.0);
    Shape square = new Square(10.0);
    Shape circle = new Circle(3.0);

    Shape[] array = {rectangle,square,circle};

    for (Shape anArr : array) {
      System.out.println(
          "Perimeter: " + anArr.perimeter() + "\n" + "Square area: " + anArr.square() + "\n");
    }
  }
}