package com.hillel;

public class Main {

  public static void main(String[] args) {
    printNumbersInThreads(100, 3);
  }

  private static void printNumbersInThreads(int number, int numberOfThreads) {
    Counter counter = new Counter(number);
    Thread[] threads = new Thread[numberOfThreads];
    for (int i = 0; i < threads.length; i++) {
      threads[i] = new Thread(new MyTask(counter, i, numberOfThreads));
    }
    for (Thread thread : threads) {
      thread.start();
    }
  }
}
