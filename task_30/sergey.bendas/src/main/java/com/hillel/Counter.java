package com.hillel;

public class Counter {

  private int maxNum;
  private int currentNum;

  public Counter(int number) {
    maxNum = number;
  }

  public synchronized boolean isNotFinished() {
    return currentNum < maxNum;
  }

  public synchronized int getCurrentNum() {
    return currentNum;
  }

  public synchronized void printNext(String name) {
    System.out.println(name + " - " + ++currentNum);
  }
}
