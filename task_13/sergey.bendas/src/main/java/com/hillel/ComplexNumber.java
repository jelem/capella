package com.hillel;

import java.math.BigDecimal;

public class ComplexNumber {

  private double real;
  private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public ComplexNumber add(ComplexNumber number) {
    double newReal = this.real + number.real;
    double newImaginary = this.imaginary + number.imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber add(double real, double imaginary) {
    double newReal = this.real + real;
    double newImaginary = this.imaginary + imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber sub(ComplexNumber number) {
    double newReal = this.real - number.real;
    double newImaginary = this.imaginary - number.imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber sub(double real, double imaginary) {
    double newReal = this.real - real;
    double newImaginary = this.imaginary - imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber mul(ComplexNumber number) {
    double newReal = this.real * number.real - this.imaginary * number.imaginary;
    double newImaginary = this.imaginary * number.real + this.real * number.imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber mul(double real, double imaginary) {
    double newReal = this.real * real - this.imaginary * imaginary;
    double newImaginary = this.imaginary * real + this.real * imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber div(ComplexNumber number) {
    if (number.real == 0 && number.imaginary == 0) {
      System.out.println(
          "Error: in (" + this.toString() + ") / (" + number.toString() + ") is division by Zero");
      return this;
    }
    double newReal =
        (this.real * number.real + this.imaginary * number.imaginary)
            / (Math.pow(number.real, 2) + Math.pow(number.imaginary, 2));
    double newImaginary =
        (this.imaginary * number.real - this.real * number.imaginary)
            / (Math.pow(number.real, 2) + Math.pow(number.imaginary, 2));
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber div(double real, double imaginary) {
    if (real == 0 && imaginary == 0) {
      System.out.println(
          "Error: in " + this.toString() + " / " + new ComplexNumber(real, imaginary).toString()
              + " is division by Zero");
      return this;
    }
    double newReal =
        (this.real * real + this.imaginary * imaginary)
            / (Math.pow(real, 2) + Math.pow(imaginary, 2));
    double newImaginary =
        (this.imaginary * real - this.real * imaginary)
            / (Math.pow(real, 2) + Math.pow(imaginary, 2));
    return new ComplexNumber(newReal, newImaginary);
  }

  public ComplexNumber sqrt() {
    int sign = this.imaginary < 0 ? -1 : 1;
    double newReal = Math
        .sqrt((Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2)) + this.real) / 2);
    double newImaginary = Math
        .sqrt((Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2)) - this.real) / 2)
        * sign;
    return new ComplexNumber(newReal, newImaginary);
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  @Override
  public String toString() {
    String sign = this.imaginary < 0 ? "-" : "+";
    double real = (double) Math.round(this.real * 1000) / 1000;
    double imaginary = (double) Math.round(this.imaginary * 1000) / 1000;
    String stringReal = (real == Math.round(real) ? Long.toString(Math.round(real))
        : Double.toString(real));
    String stringImaginary = (imaginary == Math.round(imaginary) ? Long
        .toString(Math.abs(Math.round(imaginary))) : Double.toString(Math.abs(imaginary)));
    if (this.real == 0 && this.imaginary == 0) {
      return "0";
    } else if (this.real == 0) {
      return sign + stringImaginary + "i";
    } else if (this.imaginary == 0) {
      return stringReal;
    } else {

      return stringReal + " " + sign + " " + stringImaginary + "i";
    }
  }
}
