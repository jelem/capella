package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ComplexTest {

  @Test
  public void shouldAdd() {
    Complex number = new Complex(2, 2);
    Complex check = new Complex(4, 4);
    Complex result = number.addition(number);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldAdd2() {
    Complex number = new Complex(1.2, 3.3);
    Complex number2 = new Complex(1.3, 1.7);
    Complex check = new Complex(2.5, 5);
    Complex result = number.addition(number2);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldSub() {
    Complex number = new Complex(1.2, 3.3);
    Complex result = number.subtraction(number);
    assertThat(result.toString(), is("0"));
  }

  @Test
  public void shouldSub2() {
    Complex number = new Complex(2.4, 3.3);
    Complex number2 = new Complex(1.2, 1.3);
    Complex check = new Complex(1.2, 2);
    Complex result = number.subtraction(number2);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldMul() {
    Complex number = new Complex(2.1, 1.4);
    Complex number2 = new Complex(1.2, 5.2);
    Complex check = new Complex(-4.76, 12.6);
    Complex result = number.multiplication(number2);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldMul2() {
    Complex number = new Complex(2.4, 3.3);
    Complex number2 = new Complex(1.2, 1.3);
    Complex check = new Complex(-1.41, 7.08);
    Complex result = number.multiplication(number2);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldDivError() {
    Complex number = new Complex(2.4, 3.3);
    Complex number2 = new Complex(0, 0);
    Complex result = number.division(number2);
    assertThat(result.toString(), is(number.toString()));
  }

  @Test
  public void shouldDiv() {
    Complex number = new Complex(3.22, 1.4);
    Complex number2 = new Complex(5.7, 4.8);
    Complex check = new Complex(0.45, -0.13);
    Complex result = number.division(number2);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldSquare() {
    Complex number = new Complex(5.13, -2.54);
    Complex check = new Complex(2.33, -0.55);
    Complex result = number.squareRoot(number);
    assertThat(result.toString(), is(check.toString()));
  }

  @Test
  public void shouldSquare2() {
    Complex number = new Complex(3.22, 1.4);
    Complex check = new Complex(1.83, 0.38);
    Complex result = number.squareRoot(number);
    assertThat(result.toString(), is(check.toString()));
  }
}
