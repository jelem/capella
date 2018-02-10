package com.hillel.task1;

public class Main {

  public static void main(String[] args) {
    Figure[] figures = new Figure[3];
    figures[0] = new Circle(5);
    figures[1] = new Rectangle(4,6);
    figures[2] = new Square(5);

    int numb = 1;
    for (Figure figure : figures) {
      System.out.println("\nFigure # " + numb);
      System.out.println("Square is " + figure.square());
      System.out.println("Perimeter is " + figure.perimeter());
      numb++;
    }
  }



}
