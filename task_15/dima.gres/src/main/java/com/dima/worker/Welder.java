package com.dima.worker;

public class Welder implements Worker {

  @Override
  public void work() {
    System.out.println("I'm welder. I'm making weld");
  }
}
