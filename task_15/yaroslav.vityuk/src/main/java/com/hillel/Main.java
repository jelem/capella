package com.hillel;

public class Main {

  public static void main(String[] args) {
    Figure fourSquare = new FourSquare(5);
    Figure circle = new Circle(4);
    Figure rectangle = new Rectangle(4, 6);

    Figure[] figuresArray = new Figure[3];
    figuresArray[0] = fourSquare;
    figuresArray[1] = circle;
    figuresArray[2] = rectangle;

    for (Figure helper : figuresArray) {
      System.out.println(helper.perimeter());
      System.out.println(helper.square());
    }
  }
}
