package com.hillel;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTest {

  @Test
  public void sumOfNumbersTestOne() {
    int result = Homework7.sumOfNumbers(14);
    Assert.assertEquals(5, result);
  }

  @Test
  public void sumOfNumbersTestTwo() {
    int result = Homework7.sumOfNumbers(149);
    Assert.assertEquals(14, result);
  }

  @Test
  public void sumOfNumbersTestThree() {
    int result = Homework7.sumOfNumbers(14983);
    Assert.assertEquals(25, result);
  }

  @Test
  public void factorialTestOne() {
    long result = Homework7.factorial(0);
    Assert.assertEquals(1, result);
  }

  @Test
  public void factorialTestTwo() {
    long result = Homework7.factorial(5);
    Assert.assertEquals(120, result);
  }

  @Test
  public void factorialTestThree() {
    long result = Homework7.factorial(11);
    Assert.assertEquals(39916800, result);
  }

  @Test
  public void triangleCalculationTestOne() {
    int result = Homework7.triangleCalculation(10, "perimeter");
    Assert.assertEquals(40, result);
  }

  @Test
  public void triangleCalculationTestTwo() {
    int result = Homework7.triangleCalculation(5, "square");
    Assert.assertEquals(25, result);
  }

  @Test
  public void triangleCalculationTestThree() {
    int result = Homework7.triangleCalculation(10, "other");
    Assert.assertEquals(0, result);
  }
}
