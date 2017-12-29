package com.dima.worker;

public class Painter implements Worker {
  @Override
  public void work() {
    System.out.println("I'm painter. I'm paint the blank");
  }
}
