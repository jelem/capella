package com.hillel;

import java.math.BigDecimal;

public class Complex {

  private double real;
  private double imaginary;

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public Complex addition(Complex complex) {
    double addResReal = this.real + complex.real;
    double addResImaginary = this.imaginary + complex.imaginary;

    return new Complex(addResReal, addResImaginary);
  }

  public Complex subtraction(Complex complex) {
    double subResReal = this.real - complex.real;
    double subResImaginary = this.imaginary - complex.imaginary;

    return new Complex(subResReal, subResImaginary);
  }

  public Complex multiplication(Complex complex) {
    double mulResReal = this.real * complex.real - this.imaginary * complex.imaginary;
    double mulResImaginary = this.imaginary * complex.real + this.real * complex.imaginary;

    return new Complex(mulResReal, mulResImaginary);
  }

  public Complex division(Complex complex) {
    if (complex.real == 0 && complex.imaginary == 0) {
      System.out.println("Error, we can't divide by zero");
      return this;
    }

    double firstNumenator = this.real * complex.real + this.imaginary * complex.imaginary;
    double secondNumenator = this.imaginary * complex.real - this.real * complex.imaginary;
    double denominator = complex.real * complex.real + complex.imaginary * complex.imaginary;

    double divResReal = firstNumenator / denominator;
    double divResImaginary = secondNumenator / denominator;

    return new Complex(divResReal, divResImaginary);
  }

  public Complex squareRoot(Complex complex) {
    double sum = this.real * this.real + this.imaginary * this.imaginary;
    double mod = Math.sqrt(sum);

    int sign = this.imaginary > 0 ? 1 : -1;

    double real = Math.sqrt((this.real + mod) / 2);
    double imaginary = Math.sqrt((-this.real + mod) / 2) * sign;

    return new Complex(real, imaginary);

  }

  private double round(double number) {
    BigDecimal decimalRound = new BigDecimal(number);
    decimalRound = decimalRound.setScale(2, BigDecimal.ROUND_HALF_UP);
    return decimalRound.doubleValue();
  }

  @Override
  public String toString() {
    String sign;
    if (this.imaginary > 0) {
      sign = "+";
    } else {
      sign = "-";
      this.imaginary = -round(this.imaginary);
    }

    if (this.real == 0 && this.imaginary == 0) {
      return "0";
    }

    double real = round(this.real);
    double imaginary = round(this.imaginary);
    String stringReal = Double.toString(real);
    String stringImaginary = Double.toString(imaginary);

    return stringReal + " " + sign + " " + stringImaginary + "i";
  }
}
