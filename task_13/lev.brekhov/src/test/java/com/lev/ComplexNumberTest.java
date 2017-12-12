package com.lev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {

  @Test
  public void shouldAddComplexNumber() {
    ComplexNumber add = new ComplexNumber(5.0f, 2.0f);
    ComplexNumber complexNumber = new ComplexNumber(2.0f, 7.0f);
    ComplexNumber result = complexNumber.addition(add);

    assertEquals(7, (int) result.getRealPart());
    assertEquals(9, (int) result.getImaginaryPart());
  }

  @Test
  public void shouldSubComplexNumber() {
    ComplexNumber add = new ComplexNumber(5.0f, 2.0f);
    ComplexNumber complexNumber = new ComplexNumber(2.0f, 7.0f);
    ComplexNumber result = complexNumber.subtraction(add);

    assertEquals(-3, (int) result.getRealPart());
    assertEquals(5, (int) result.getImaginaryPart());
  }

  @Test
  public void shouldMulComplexNumber() {
    ComplexNumber add = new ComplexNumber(5.0f, 2.0f);
    ComplexNumber complexNumber = new ComplexNumber(2.0f, 7.0f);
    ComplexNumber result = complexNumber.multiplication(add);

    assertEquals(-4, (int) result.getRealPart());
    assertEquals(39, (int) result.getImaginaryPart());
  }

  @Test
  public void shouldDivComplexNumber() {
    ComplexNumber add = new ComplexNumber(5.0f, 2.0f);
    ComplexNumber complexNumber = new ComplexNumber(2.0f, 7.0f);
    ComplexNumber result = complexNumber.division(add);

    assertEquals(0, (int) result.getRealPart());
    assertEquals(1, (int) result.getImaginaryPart());
  }

}
