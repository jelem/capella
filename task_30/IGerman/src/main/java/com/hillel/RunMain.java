package com.hillel;

public class RunMain {

  public static void main(String[] args) {

    Thread thread1 = new Thread(new RunOne());
    thread1.setName("RunOne");
    // thread1.setPriority(10);
    thread1.start();

    Thread thread2 = new Thread(new RunTwo());
    thread2.setName("RunTwo");
    //thread1.setPriority(5);
    thread2.start();

    try {
      Thread.sleep(100);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    for (int i = 3; i <= 100; i += 3) {
      System.out.println(Thread.currentThread().getName() + "- " + i);
      try {
        Thread.sleep(150);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }

    }
  }
}

