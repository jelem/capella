package com.hillel.figures;

public class FigureMain {

  public static void main(String[] args) {

    Square square = new Square(3);
    Round round = new Round(5.5);
    Rectangle rectangle = new Rectangle(5, 6.5);

    Figure[] figures = new Figure[3];
    figures[0] = square;
    figures[1] = round;
    figures[2] = rectangle;

    for (Figure figure : figures) {
      System.out.println(figure.perimeter());
      System.out.println(figure.square());
    }
  }
}
