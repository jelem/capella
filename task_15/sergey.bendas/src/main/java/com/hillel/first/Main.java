package com.hillel.first;

public class Main {

  public static void main(String[] args) {
    Figure[] figures = new Figure[3];
    figures[0] = new Circle(5);
    figures[1] = new Square(10);
    figures[2] = new Rectangle(3, 5);

    for (Figure figure : figures) {
      System.out.println(figure.perimeter());
      System.out.println(figure.square());
    }
  }
}
