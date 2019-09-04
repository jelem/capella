package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ComplexNumberTest {

  ComplexNumber firstNumber = new ComplexNumber(2, 7);
  ComplexNumber secondNumber = new ComplexNumber(4, 3);

  @Test
  public void additionTest() {
    ComplexNumber result = firstNumber.addition(secondNumber);
    assertThat(result, is(new ComplexNumber(6.0, 10.0)));
  }

  @Test
  public void subtractionTest() {
    ComplexNumber result = firstNumber.substraction(secondNumber);
    assertThat(result, is(new ComplexNumber(-2.0, 4.0)));
  }

  @Test
  public void multiplicationTest() {
    ComplexNumber result = firstNumber.multiplication(secondNumber);
    assertThat(result, is(new ComplexNumber(-13.0, 34.0)));
  }

  @Test
  public void divisionTest() {
    ComplexNumber result = firstNumber.division(secondNumber);
    assertThat(result, is(new ComplexNumber(1.16, 0.88)));
  }

}