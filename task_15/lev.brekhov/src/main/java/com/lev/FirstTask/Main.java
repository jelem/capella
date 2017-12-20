package com.lev.FirstTask;

public class Main {

  public static void main(String[] args) {

    Shape rectangle = new Rectangle(4.0, 10.0);
    Shape square = new Square(10.0);
    Shape circle = new Circle(3.0);

    double perimeterRect = rectangle.perimeter();
    double squareRect = rectangle.square();

    double perimeterSq = square.perimeter();
    double squareSq = square.square();

    double perimeterCircle = circle.perimeter();
    double squareCircle = circle.square();
    System.out.println(
        "Perimeter of rectangle is: " + perimeterRect + "\nSquare area of rectangle is: "
            + squareRect
            + "\n" + "\nPerimeter of square is: " + perimeterSq + "\nSquare area of square is: "
            + squareSq
            + "\n" + "\nPerimeter of circle is: " + perimeterCircle + "\nSquare of circle is: "
            + squareCircle);
  }
}