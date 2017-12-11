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

    double kor_a = Math.sqrt(module) * Math.cos((phi + 2 * Math.PI) / 2);
    double kor_b = Math.sqrt(module) * Math.cos((phi + 2 * Math.PI) / 2);
    return new ComplexNumber(kor_a, kor_b);
  }

  @Override
  public String toString() {
    return this.alpha + " + " + this.beta + " * i";
  }

  @Override
  public boolean equals(Object ob) {
    ComplexNumber other = (ComplexNumber)ob;
    return this.alpha == other.alpha && this.beta == other.beta;
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
