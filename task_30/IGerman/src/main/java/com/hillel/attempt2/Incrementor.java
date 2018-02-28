package com.hillel.attempt2;

public class Incrementor implements Runnable {

  private Counter counter;
  private int numThread;

  public Incrementor(Counter counter, int num) {
    this.counter = counter;
    this.numThread = num;
  }

  @Override
  public void run() {
    while (!counter.isCompleted()) {
      if (counter.getValue() % counter.getNumbOfThreads() == numThread) {

        counter.print(Thread.currentThread().getName());
      }
    }

  }
}
