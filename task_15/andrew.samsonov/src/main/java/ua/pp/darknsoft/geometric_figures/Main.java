package ua.pp.darknsoft.geometric_figures;

import ua.pp.darknsoft.geometric_figures.heirs.Circle;
import ua.pp.darknsoft.geometric_figures.heirs.Rectangle;
import ua.pp.darknsoft.geometric_figures.heirs.Square;

/**
 * Created by Andrew on 15.12.2017.
 */
public class Main {

  public static void main(String[] args) {
    Figure figureOne = new Circle(5);
    Figure figureTwo = new Rectangle(2, 4);
    Figure figureThree = new Square(4);

    Figure[] figures = new Figure[]{figureOne, figureTwo, figureThree};

    for (Figure figa : figures) {
      System.out.println(
          "Фигура: " + figa.getClass().getSimpleName() + "; Периметр: " + figa.calculatePerimeter()
              + "; Площадь: " + figa.calculateSquare());
    }
  }

}
