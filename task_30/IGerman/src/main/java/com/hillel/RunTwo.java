package com.hillel;

public class RunTwo implements Runnable {


  @Override
  public void run() {
    try {
      Thread.sleep(50);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

    for (int i = 2; i <= 100; i += 3) {
      System.out.println(Thread.currentThread().getName() + "- " + i);
      try {
        Thread.sleep(150);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}

