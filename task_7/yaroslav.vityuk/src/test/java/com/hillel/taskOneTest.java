package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TaskOneTest {

  @Test
  public void shouldSumDigits() {
    int result = TaskOne.sumOfDigits(123543);
    int result1 = TaskOne.sumOfDigits(111111);
    int result2 = TaskOne.sumOfDigits(132844);

    assertEquals(18, result);
    assertEquals(6, result1);
    assertEquals(22, result2);
  }

  @Test
  public void shouldFactorial() {
    int result = TaskOne.factorial(5);
    int result1 = TaskOne.factorial(6);
    int result2 = TaskOne.factorial(4);

    assertEquals(120, result);
    assertEquals(720, result1);
    assertEquals(24, result2);
  }

  @Test
  public void shouldSquare() {
    int result = TaskOne.triangleCalculation(10, "square");
    int result1 = TaskOne.triangleCalculation(2, "square");
    int result2 = TaskOne.triangleCalculation(17, "square");

    assertEquals(100, result);
    assertEquals(4, result1);
    assertEquals(289, result2);
  }

  @Test
  public void shouldPerimeter() {
    int result = TaskOne.triangleCalculation(10, "perimeter");
    int result1 = TaskOne.triangleCalculation(2, "perimeter");
    int result2 = TaskOne.triangleCalculation(17, "perimeter");

    assertEquals(40, result);
    assertEquals(8, result1);
    assertEquals(68, result2);
  }

  @Test
  public void shouldError() {
    int result = TaskOne.triangleCalculation(10, "asd");
    int result1 = TaskOne.triangleCalculation(2, "perimet");
    int result2 = TaskOne.triangleCalculation(17, "");

    assertEquals(0, result);
    assertEquals(0, result1);
    assertEquals(0, result2);
  }

}
