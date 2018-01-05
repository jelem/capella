package com.hillel;

public class ComplexNumber {

  private double firstNumber;
  private double secondNumber;

  public ComplexNumber(double firstNumber, double secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  public ComplexNumber addition (ComplexNumber number) {
    double first = firstNumber + number.firstNumber;
    double second = secondNumber + number.secondNumber;
    return new ComplexNumber(first, second);
  }

  public ComplexNumber substraction(ComplexNumber numb) {
    double first = this.firstNumber - numb.firstNumber;
    double second = this.secondNumber - numb.secondNumber;
    return new ComplexNumber(first, second);
  }

  public ComplexNumber multiplication(ComplexNumber numb) {
    double first = this.firstNumber * numb.firstNumber - this.secondNumber * numb.secondNumber;
    double second = this.secondNumber * numb.firstNumber + this.firstNumber * numb.secondNumber;
    return new ComplexNumber(first, second);
  }

  public ComplexNumber division(ComplexNumber numb) {
    double first = (this.firstNumber * numb.firstNumber + this.secondNumber
        * numb.secondNumber) / (numb.firstNumber * numb.firstNumber
        + numb.secondNumber * numb.secondNumber);
    double second = (this.secondNumber * numb.firstNumber - this.firstNumber
        * numb.secondNumber) / (numb.firstNumber * numb.firstNumber
        + numb.secondNumber * numb.secondNumber);
    return new ComplexNumber(first, second);
  }

  public ComplexNumber complexSqrt() {
    double module = Math.sqrt(this.firstNumber * this.firstNumber
        + this.secondNumber * this.secondNumber);
    double phi = Math.acos(this.firstNumber / (Math.sqrt(module)));

    double korA = Math.sqrt(module) * Math.cos((phi + 2 * Math.PI) / 2);
    double korB = Math.sqrt(module) * Math.cos((phi + 2 * Math.PI) / 2);
    return new ComplexNumber(korA, korB);
  }

  @Override
  public String toString() {
    return this.firstNumber + " + " + this.secondNumber + " * i";
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    ComplexNumber that = (ComplexNumber) object;

    return this.firstNumber == that.firstNumber && this.secondNumber == that.secondNumber;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(firstNumber);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(secondNumber);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

}
