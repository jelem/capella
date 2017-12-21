package com.lev.FirstTask;

public class Main {

  public static void main(String[] args) {

    Shape rectangle = new Rectangle(4.0, 10.0);
    Shape square = new Square(10.0);
    Shape circle = new Circle(3.0);

    Shape[] arr = {rectangle,square,circle};

    for (Shape anArr : arr) {
      System.out.println(
          "Perimeter: " + anArr.perimeter() + "\n" + "Square area: " + anArr.square() + "\n");
    }
  }
}