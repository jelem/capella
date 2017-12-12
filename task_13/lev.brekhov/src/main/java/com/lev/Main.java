package com.lev;

public class Main {

  public static void main(String[] args) {

    ComplexNumber compNum = new ComplexNumber(3, 4);
    ComplexNumber compNum2 = new ComplexNumber(1, 6);

    ComplexNumber cAdd = compNum.addition(compNum2);
    ComplexNumber cSub = compNum.subtraction(compNum2);
    ComplexNumber cMul = compNum.multiplication(compNum2);
    ComplexNumber cDiv = compNum.division(compNum2);

    System.out.println(cAdd);
    System.out.println(cSub);
    System.out.println(cMul);
    System.out.println(cDiv);
  }
}
