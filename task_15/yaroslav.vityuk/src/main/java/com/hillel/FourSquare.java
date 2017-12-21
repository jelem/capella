package com.hillel;

public class FourSquare extends Figure {

  private int side;

  public FourSquare(int side) {
    this.side = side;
  }

  public int perimeter() {
    System.out.print("Foursquare perimeter= ");
    return side * 4;
  }

  public int square() {
    System.out.print("Foursquare square= ");
    return side * side;
  }

}
