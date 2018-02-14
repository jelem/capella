package com.lev.task1;

public class ReturnTest {

  public static void main(String[] args) {
    System.out.println("Before test method");
    testMethod();
    System.out.println("After test method");
  }

  private static void testMethod() {
    try {
      criticalMethod();
      return;
    } catch (Exception e) {
      System.out.println("Something went wrong");
      return;
    } finally {
      System.out.println("We are in finally now");
    }
  }

  private static void criticalMethod() throws Exception {
    if (true) {
      throw new Exception();
    }
  }
}