package com.dima;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ComplexTest {

  public static final double DELTA = .0001;

  @Test
  public void constructorDefaultTest() {
    Complex complex = new Complex();
    assertEquals(complex.getReal(), 0, DELTA);
    assertEquals(complex.getImagine(), 0, DELTA);
  }

  @Test
  public void constructorWithTwoParramTest() {
    Complex complex = new Complex(1,2);
    assertEquals(complex.getReal(), 1, DELTA);
    assertEquals(complex.getImagine(), 2, DELTA);
  }

  @Test
  public void addTest() {
    Complex one = new Complex(1,2);
    Complex two = new Complex(3,7);
    Complex summ = Complex.add(one, two);
    assertEquals(summ.getReal(), 1 + 3, DELTA);
    assertEquals(summ.getImagine(), 2 + 7, DELTA);
  }

  @Test
  public void diffTest() {
    Complex one = new Complex(1,2);
    Complex two = new Complex(3,7);
    Complex diff = Complex.diff(one, two);
    assertEquals(diff.getReal(), 1 - 3, DELTA);
    assertEquals(diff.getImagine(), 2 - 7, DELTA);
  }

  @Test
  public void multiplyTest() {
    Complex one = new Complex(1,2);
    Complex two = new Complex(3,7);
    Complex product = Complex.multiply(one, two);
    assertEquals(product.getReal(), 1 * 3, DELTA);
    assertEquals(product.getImagine(), 2 * 7, DELTA);
  }

  @Test
  public void divTest() {
    Complex one = new Complex(1,2);
    Complex two = new Complex(3,7);
    Complex div = Complex.div(one, two);
    assertEquals(div.getReal(), 1. / 3, DELTA);
    assertEquals(div.getImagine(), 2. / 7, DELTA);
  }

  @Test
  public void sqrtForDoubleMoreZeroTest() {
    Complex result  = Complex.sqrt(1);
    assertEquals(result.getReal(), 1., DELTA);
    assertEquals(result.getImagine(), 0., DELTA);
  }

  @Test
  public void sqrtForDoubleEqualZeroTest() {
    Complex result  = Complex.sqrt(0);
    assertEquals(result.getReal(), 0., DELTA);
    assertEquals(result.getImagine(), 0., DELTA);
  }

  @Test
  public void sqrtForDoubleLessZeroTest() {
    Complex result  = Complex.sqrt(-9);
    assertEquals(result.getReal(), 0., DELTA);
    assertEquals(result.getImagine(), 3., DELTA);
  }

  @Test
  public void sqrtForComplexTest_I() {
    Complex complex = new Complex(1, 0);
    Complex result  = Complex.sqrt(complex);
    assertEquals(result.getReal(), 1., DELTA);
    assertEquals(result.getImagine(), 0., DELTA);
  }

  @Test
  public void sqrtForComplexTest_II() {
    Complex complex = new Complex(-1, 0);
    Complex result  = Complex.sqrt(complex);
    assertEquals(result.getReal(), 0., DELTA);
    assertEquals(result.getImagine(), 1., DELTA);
  }

  @Test
  public void sqrtForComplexTest_III() {
    Complex complex = new Complex(0, 1);
    Complex result  = Complex.sqrt(complex);
    assertEquals(result.getReal(), Math.sqrt(2) / 2., DELTA);
    assertEquals(result.getImagine(), Math.sqrt(2) / 2., DELTA);
  }

  @Test
  public void toStringForNumMoreThenZeroTest() {
    Complex complex = new Complex(3, 4);
    String actual = complex.toString();
    String expected = "3.0 + 4.0*i";
    assertEquals(actual, expected);
  }

  @Test
  public void toStringForNumLessThenZeroTest() {
    Complex complex = new Complex(3, -4);
    String actual = complex.toString();
    String expected = "3.0 - 4.0*i";
    assertEquals(actual, expected);
  }
}
