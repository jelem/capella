package com.hillel.attempt3;

public class TreadsPrinting implements Runnable {

  Counter counter;

  public TreadsPrinting(Counter counter) {
    this.counter = counter;
  }

  public static void main(String[] args) {
    Counter counter = new Counter(0, 100, 3);

    Thread thread1 = new Thread(new TreadsPrinting(counter));
    Thread thread2 = new Thread(new TreadsPrinting(counter));
    Thread thread3 = new Thread(new TreadsPrinting(counter));
    thread1.setName("0");
    thread2.setName("1");
    thread3.setName("2");
    thread1.start();
    thread2.start();
    thread3.start();
    try {
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void run() {
    counter.printNumbers();
  }
}
