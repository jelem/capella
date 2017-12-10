package com.hillel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ComplexNumberTest {

  public ComplexNumber one = new ComplexNumber(3, 5);
  public ComplexNumber two = new ComplexNumber(2, 6);

  @Test
  public void shouldCountAddComplexNumber() {

    ComplexNumber result = one.addition(two);

    assertThat(result.toString(), is("5.0 + 11.0i"));
  }

  @Test
  public void shouldCountSubComplexNumber() {

    ComplexNumber result = one.subtraction(two);

    assertThat(result.toString(), is("1.0 - 1.0i"));
  }

  @Test
  public void shouldCountMultComplexNumber() {

    ComplexNumber result = one.multiplication(two);

    assertThat(result.toString(), is("-24.0 + 28.0i"));
  }

  @Test
  public void shouldCountDivComplexNumber() {

    ComplexNumber result = one.division(two);

    assertThat(result.toString(), is("0.9 - 0.2i"));
  }


}
