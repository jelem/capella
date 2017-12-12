package com.lev;

public class ComplexNumber {

  private float realPart, imaginaryPart;

  public ComplexNumber(float realPart, float imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }

  public float getRealPart() {
    return realPart;
  }

  public float getImaginaryPart() {
    return imaginaryPart;
  }

  public ComplexNumber() {}

  @Override
  public String toString() {
    return realPart + " + " + imaginaryPart + "i";
  }

  public ComplexNumber addition(ComplexNumber add) {
    return new ComplexNumber(realPart + add.realPart, imaginaryPart + add.imaginaryPart);
  }

  public ComplexNumber subtraction(ComplexNumber sub) {
    return new ComplexNumber(realPart - sub.realPart, imaginaryPart - sub.imaginaryPart);
  }

  public ComplexNumber multiplication(ComplexNumber mul) {
    return new ComplexNumber((realPart * mul.realPart - imaginaryPart * mul.imaginaryPart),
                            (mul.realPart * imaginaryPart + realPart * mul.imaginaryPart));
  }

  public ComplexNumber division(ComplexNumber div) {
    return new ComplexNumber((float)((realPart * div.realPart + imaginaryPart * div.imaginaryPart)/(Math.pow(div.realPart,2) + (Math.pow(div.imaginaryPart,2)))),
                             (float)((imaginaryPart * div.realPart - realPart * div.imaginaryPart)/(Math.pow(div.realPart,2) + (Math.pow(div.imaginaryPart,2)))));
  }
}

