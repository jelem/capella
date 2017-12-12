package com.lev;

public class Main {

  public static void main(String[] args) {

    ComplexNumber compNum = new ComplexNumber(3, 4);
    ComplexNumber compNum2 = new ComplexNumber(1, 6);

    ComplexNumber compAdd = compNum.addition(compNum2);
    ComplexNumber compSub = compNum.subtraction(compNum2);
    ComplexNumber compMul = compNum.multiplication(compNum2);
    ComplexNumber compDiv = compNum.division(compNum2);

    System.out.println(compAdd);
    System.out.println(compSub);
    System.out.println(compMul);
    System.out.println(compDiv);
  }
}
