package com.dima;

public class Complex {

  private double real;
  private double imagine;

  public double getReal() {
    return real;
  }

  public double getImagine() {
    return imagine;
  }

  public Complex(double real, double imagine) {
    this.real = real;
    this.imagine = imagine;
  }

  @Override
  public String toString() {
    return imagine > 0 ? real + " + " + imagine + "*i" : real + " - " + -imagine + "*i";
  }

  public Complex() {
    real = 0;
    imagine = 0;
  }

  public static Complex add(Complex first, Complex second) {
    return new Complex(first.real + second.real, first.imagine + second.imagine);
  }

  public static Complex diff(Complex first, Complex second) {
    return new Complex(first.real - second.real, first.imagine - second.imagine);
  }

  public static Complex multiply(Complex first, Complex second) {
    return new Complex(first.real * second.real, first.imagine * second.imagine);
  }

  public static Complex div(Complex first, Complex second) {
    return new Complex(first.real / second.real, first.imagine / second.imagine);
  }

  public static Complex sqrt(double num) {
    return Complex.sqrt(new Complex(num , 0));
  }

  public static Complex sqrt(Complex num) {
    double length = num.abs();
    double angle = Math.acos(num.real / length);
    return new Complex(length * Math.cos(angle / 2), length * Math.sin(angle / 2));
  }



  public static double abs(Complex num) {
    return Math.sqrt(Math.pow(num.real, 2) + Math.pow(num.imagine, 2));
  }

  public double abs() {
    return Math.sqrt(Math.pow(real, 2) + Math.pow(imagine, 2));
  }
}
