package com.hillel.attempt3;

public class Counter {

  private int currentValue;
  private int maxValue;
  private int numberOfThreads;

  public Counter(int currentValue, int maxValue, int numberOfThreads) {
    this.currentValue = currentValue;
    this.maxValue = maxValue;
    this.numberOfThreads = numberOfThreads;
  }

  public synchronized boolean isFinished() {
    return (currentValue >= maxValue);
  }

  public synchronized void printNumbers() {
    while (!isFinished()) {
      if (Integer.parseInt(Thread.currentThread().getName()) == currentValue % numberOfThreads) {
        currentValue++;
        System.out.println("Thread-" + Thread.currentThread().getName() + " - " + currentValue);
        notifyAll();
      } else {
        try {
          wait();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      }
    }
  }
}


