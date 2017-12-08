package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestComplexNumber {

  private static final ComplexNumber COMPLEX_NUMBER_ZERO = new ComplexNumber(0, 0);
  private static final ComplexNumber COMPLEX_NUMBER_ADDITION = new ComplexNumber(2, -4);
  private static final ComplexNumber COMPLEX_NUMBER_SUBTRACTION = new ComplexNumber(8, -8);
  private static final ComplexNumber COMPLEX_NUMBER_MULTIPLICATION = new ComplexNumber(-5, -1);
  private static final ComplexNumber COMPLEX_NUMBER_DIVISION = new ComplexNumber(-3.0 / 2.0,
      -1.0 / 2.0);
  private static final double ABSOLUTE_COMPLEX_NUMBER = Math.sqrt(34);
  private static final double ARGUMENT_OF_A_COMPLEX_NUMBER = (5 * Math.PI) / 4;
  private static final ComplexNumber[] COMPLEX_NUMBERS_SQRT_04 = {
      new ComplexNumber(Math.sqrt(2.0) / 2.0, Math.sqrt(2.0) / 2.0),
      new ComplexNumber(-Math.sqrt(2.0) / 2.0, Math.sqrt(2.0) / 2.0),
      new ComplexNumber(-Math.sqrt(2.0) / 2.0, -Math.sqrt(2.0) / 2.0),
      new ComplexNumber(Math.sqrt(2.0) / 2.0, -Math.sqrt(2.0) / 2.0)
  };

  @Test
  public void additionTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(5, -6);
    ComplexNumber betaComplex = new ComplexNumber(-3, 2);
    ComplexNumber actual = alphaComplex.addition(betaComplex);
    assertThat(actual, is(COMPLEX_NUMBER_ADDITION));
  }

  @Test
  public void subtractionTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(5, -6);
    ComplexNumber betaComplex = new ComplexNumber(-3, 2);
    ComplexNumber actual = alphaComplex.subtraction(betaComplex);
    assertThat(actual, is(COMPLEX_NUMBER_SUBTRACTION));
  }

  @Test
  public void multiplicationTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(2, 3);
    ComplexNumber betaComplex = new ComplexNumber(-1, 1);
    ComplexNumber actual = alphaComplex.multiplication(betaComplex);
    assertThat(actual, is(COMPLEX_NUMBER_MULTIPLICATION));
  }

  @Test
  public void multiplicationTest02() {
    ComplexNumber alphaComplex = new ComplexNumber(2, 3);
    ComplexNumber betaComplex = new ComplexNumber(0, 0);
    ComplexNumber actual = alphaComplex.multiplication(betaComplex);
    assertThat(actual, is(COMPLEX_NUMBER_ZERO));
  }

  @Test
  public void divisionTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(-2, 1);
    ComplexNumber betaComplex = new ComplexNumber(1, -1);
    ComplexNumber actual = alphaComplex.division(betaComplex);
    assertThat(actual, is(COMPLEX_NUMBER_DIVISION));
  }

  @Test
  public void divisionTest02() {
    ComplexNumber alphaComplex = new ComplexNumber(-2, 1);
    ComplexNumber betaComplex = new ComplexNumber(0, 0);
    ComplexNumber actual = alphaComplex.division(betaComplex);
    assertThat(actual, is(COMPLEX_NUMBER_ZERO));
  }

  @Test
  public void absComplexNumberTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(5, -3);
    double actual = alphaComplex.absComplexNumber(alphaComplex);
    assertThat(actual, is(ABSOLUTE_COMPLEX_NUMBER));
  }

  @Test
  public void argComplexNumberTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(-3, -3);
    double actual = alphaComplex.argComplexNumber(alphaComplex);
    assertThat(actual, is(ARGUMENT_OF_A_COMPLEX_NUMBER));
  }

  @Test
  public void extractionOfARootTest01() {
    ComplexNumber alphaComplex = new ComplexNumber(-1, 0);
    ComplexNumber[] actual = alphaComplex.extractionOfARoot(4);
    assertThat(actual, is(COMPLEX_NUMBERS_SQRT_04));
  }
}
