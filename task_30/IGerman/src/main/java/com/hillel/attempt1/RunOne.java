package com.hillel.attempt1;

public class RunOne implements Runnable {


  @Override
  public void run() {

    for (int i = 1; i <= 100; i += 3) {
      System.out.println(Thread.currentThread().getName() + "- " + i);
      try {
        Thread.sleep(150);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }

    }
  }
}
