package com.hillel;

public class MyTask implements Runnable {

  private Counter counter;
  private int threadNum;
  private int numberOfThreads;

  public MyTask(Counter counter, int num, int numberOfThreads) {
    this.counter = counter;
    this.threadNum = num;
    this.numberOfThreads = numberOfThreads;
  }

  @Override
  public void run() {
    while (counter.isNotFinished()) {
      if (counter.getCurrentNum() % numberOfThreads == threadNum) {
        counter.printNext(Thread.currentThread().getName());
      }
      Thread.yield();
    }
  }
}
