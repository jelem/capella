package com.hillel;

public class Main {

  public static void main(String[] args) {

    ComplexNumber first = new ComplexNumber(3, 5);
    ComplexNumber second = new ComplexNumber(4, 9);
    System.out.println(first.addition(second).toString());
    System.out.println(first.subtraction(second).toString());
    System.out.println(first.multiplication(second).toString());
    System.out.println(first.division(second).toString());
  }

}