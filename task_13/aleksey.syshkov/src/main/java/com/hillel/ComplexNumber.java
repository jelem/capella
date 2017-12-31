package com.hillel;

public class ComplexNumber {

  private double alpha;
  private double beta;

  public ComplexNumber(double alpha, double beta) {
    this.alpha = alpha;
    this.beta = beta;
  }

  public ComplexNumber addition(ComplexNumber numb) {
    double first = this.alpha + numb.alpha;
    double second = this.beta + numb.beta;
    return new ComplexNumber(first, second);
  }

  public ComplexNumber substraction(ComplexNumber numb) {
    double first = this.alpha - numb.alpha;
    double second = this.beta - numb.beta;
    return new ComplexNumber(first, second);
  }

  public ComplexNumber multiplication(ComplexNumber numb) {
    double first = this.alpha * numb.alpha - this.beta * numb.beta;
    double second = this.beta * numb.alpha + this.alpha * numb.beta;
    return new ComplexNumber(first, second);
  }

  public ComplexNumber division(ComplexNumber numb) {
    double first = (this.alpha * numb.alpha + this.beta
        * numb.beta) / (numb.alpha * numb.alpha + numb.beta * numb.beta);
    double second = (this.beta * numb.alpha - this.alpha * numb.beta) / (numb.alpha * numb.alpha
        + numb.beta * numb.beta);
    return new ComplexNumber(first, second);
  }

  public ComplexNumber complexSqrt() {
    double module = Math.sqrt(this.alpha * this.alpha + this.beta * this.beta);
    double phi = Math.acos(this.alpha / (Math.sqrt(module)));

    double korA = Math.sqrt(module) * Math.cos((phi + 2 * Math.PI) / 2);
    double korB = Math.sqrt(module) * Math.cos((phi + 2 * Math.PI) / 2);
    return new ComplexNumber(korA, korB);
  }

  @Override
  public String toString() {
    return this.alpha + " + " + this.beta + " * i";
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

    return this.alpha == that.alpha && this.beta == that.beta;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(alpha);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(beta);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
