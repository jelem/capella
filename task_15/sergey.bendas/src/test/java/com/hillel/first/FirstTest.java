package com.hillel.first;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FirstTest {

  private Circle circle = new Circle(20);
  private Square square = new Square(7);
  private Rectangle rectangle = new Rectangle(5, 8);

  @Test
  public void shouldCirclePerimeter() {
    double result = circle.perimeter();
    assertThat((int) result, is(125));
  }

  @Test
  public void shouldCircleSquare() {
    double result = circle.square();
    assertThat((int) result, is(1256));
  }

  @Test
  public void shouldSquarePerimeter() {
    double result = square.perimeter();
    assertThat(result, is(28.0));
  }

  @Test
  public void shouldSquareSquare() {
    double result = square.square();
    assertThat(result, is(49.0));
  }

  @Test
  public void shouldRectanglePerimeter() {
    double result = rectangle.perimeter();
    assertThat(result, is(26.0));
  }

  @Test
  public void shouldRectangleSquare() {
    double result = rectangle.square();
    assertThat(result, is(40.0));
  }
}
