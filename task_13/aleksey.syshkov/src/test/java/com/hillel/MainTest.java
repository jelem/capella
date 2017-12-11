package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MainTest {

  ComplexNumber number1 = new ComplexNumber(2, 7);
  ComplexNumber number2 = new ComplexNumber(4, 3);

  @Test
  public void isNumberCorrect1() {
    ComplexNumber add = number1.addition(number2);
    add.equals(new ComplexNumber(6.0, 10.0));
    assertThat(add, is(new ComplexNumber(6.0, 10.0)));
  }

  @Test
  public void isNumberCorrect2() {
    ComplexNumber subs = number1.substraction(number2);
    assertThat(subs, is(new ComplexNumber(-2.0, 4.0)));
  }

  @Test
  public void isNumberCorrect3() {
    ComplexNumber multi = number1.multiplication(number2);
    assertThat(multi, is(new ComplexNumber(-13.0, 34.0)));
  }

  @Test
  public void isNumberCorrect4() {
    ComplexNumber divis = number1.division(number2);
    assertThat(divis, is(new ComplexNumber(1.16, 0.88)));
  }


}
