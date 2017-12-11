package com.hillel;

public class ComplexNumber {

  private double realPart;
  private double imaginaryPart;


  public ComplexNumber(int realPart, int imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }

  public double getRealPart() {
    return realPart;
  }

  public void setRealPart(int realPart) {
    this.realPart = realPart;
  }

  public double getImaginaryPart() {
    return imaginaryPart;
  }

  public void setImaginaryPart(int imaginaryPart) {
    this.imaginaryPart = imaginaryPart;
  }

  @Override
  public String toString() {
    if (imaginaryPart > 0) {
      return realPart + " + " + imaginaryPart + "i";
    } else if (imaginaryPart < 0) {
      return realPart + " - " + Math.abs(imaginaryPart) + "i";
    } else {
      return "" + realPart;
    }
  }

  public ComplexNumber addition(ComplexNumber two) {
    ComplexNumber result = new ComplexNumber(0, 0);
    result.realPart = this.realPart + two.realPart;
    result.imaginaryPart = this.imaginaryPart + two.imaginaryPart;
    return result;
  }

  public ComplexNumber subtraction(ComplexNumber two) {
    ComplexNumber result = new ComplexNumber(0, 0);
    result.realPart = this.realPart - two.realPart;
    result.imaginaryPart = this.imaginaryPart - two.imaginaryPart;
    return result;
  }

  public ComplexNumber multiplication(ComplexNumber two) {
    ComplexNumber result = new ComplexNumber(0, 0);
    result.realPart = this.realPart * two.realPart - this.imaginaryPart * two.imaginaryPart;
    result.imaginaryPart = this.imaginaryPart * two.realPart + this.realPart * two.imaginaryPart;
    return result;
  }

  public ComplexNumber division(ComplexNumber two) {
    ComplexNumber result = new ComplexNumber(0, 0);
    result.realPart = (this.realPart * two.realPart + this.imaginaryPart * two.imaginaryPart)
        / (Math.pow(two.realPart, 2) + Math.pow(two.imaginaryPart, 2));
    result.imaginaryPart = (this.imaginaryPart * two.realPart - this.realPart * two.imaginaryPart)
        / (Math.pow(two.realPart, 2) + Math.pow(two.imaginaryPart, 2));
    return result;
  }

}
