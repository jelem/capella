package com.hillel;

public class Main {

  public static void main(String[] args) {

    Figure figuresArray[] = new Figure[]{
        new Square(5.0),
        new Square(15.0),
        new Rectangle(5.0, 10.0),
        new Rectangle(20.0, 30.0),
        new Circle(5.0),
        new Circle(10.0)};

    for (int i = 0; i < 6; i++) {
      System.out.println(figuresArray[i].calculatePerimeter());
      System.out.println(figuresArray[i].calculateSquare());
    }

    Worker smallOffice[] = new Worker[]{
        new HR("Female", 25),
        new Developer("Male", 30),
        new CEO("Male", 40)};

    for (int i = 0; i < 3; i++) {
      smallOffice[i].work();
    }
  }

}
