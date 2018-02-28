package com.hillel.attempt2;

public class Main {

  public static void main(String[] args) {

    Counter counter = new Counter(100, 3);

    Thread[] threads = new Thread[counter.getNumbOfThreads()];
    for (int i = 0; i < threads.length; i++) {
      threads[i] = new Thread(new Incrementor(counter, i));
    }

    for (Thread thread : threads) {
      thread.start();
    }
  }

}




