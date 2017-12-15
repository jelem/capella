package ua.pp.darknsoft.geometric_figures.heirs;

import ua.pp.darknsoft.geometric_figures.Figure;

public class Square extends Figure {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double calculatePerimeter() {

    return 4.0 * side;
  }

  @Override
  public double calculateSquare() {

    return side * side;
  }

}
