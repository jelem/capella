package ua.pp.darknsoft.geometric_figures.heirs;

import ua.pp.darknsoft.geometric_figures.Figure;

public class Rectangle extends Figure {

  private double firstSide;
  private double secondSide;

  public Rectangle(double firstSide, double secondSide) {
    this.firstSide = firstSide;
    this.secondSide = secondSide;
  }

  @Override
  public double calculatePerimeter() {

    return 2.0 * (firstSide + secondSide);
  }

  @Override
  public double calculateSquare() {

    return firstSide * secondSide;
  }

}
