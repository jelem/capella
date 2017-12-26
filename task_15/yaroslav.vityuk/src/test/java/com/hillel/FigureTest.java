package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FigureTest {

  @Test
  public void shouldPerimeterCircle() {
    Figure circle = new Circle(6);
    int result = circle.perimeter();
    assertThat(result, is(36));
  }

  @Test
  public void shouldSquareCircle() {
    Figure circle = new Circle(6);
    int result = circle.square();
    assertThat(result, is(108));
  }

  @Test
  public void shouldPerimeterRectangle() {
    Figure rectangle = new Rectangle(6, 4);
    int result = rectangle.perimeter();
    assertThat(result, is(20));
  }

  @Test
  public void shouldSquareRectangle() {
    Figure rectangle = new Rectangle(6, 4);
    int result = rectangle.square();
    assertThat(result, is(24));
  }

  @Test
  public void shouldSquareFourSquare() {
    Figure rectangle = new FourSquare(5);
    int result = rectangle.square();
    assertThat(result, is(25));
  }

  @Test
  public void shouldPerimeterFourSquare() {
    Figure rectangle = new FourSquare(5);
    int result = rectangle.perimeter();
    assertThat(result, is(20));
  }

}
