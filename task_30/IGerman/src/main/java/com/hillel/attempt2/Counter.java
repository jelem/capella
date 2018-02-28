package com.hillel.attempt2;

public class Counter {

  private int value;
  private int maxNumber;
  private int numbOfThreads;

  public Counter(int maxNumber, int numbOfThreads) {

    this.maxNumber = maxNumber;
    this.numbOfThreads = numbOfThreads;
  }


  public synchronized int getValue() {
    return value;
  }

  public synchronized void setValue(int value) {
    this.value = value;
  }

  public int getNumber() {
    return maxNumber;
  }

  public void setNumber(int number) {
    this.maxNumber = number;
  }

  public int getNumbOfThreads() {
    return numbOfThreads;
  }

  public void setNumbOfThreads(int numbOfThreads) {
    this.numbOfThreads = numbOfThreads;
  }

  public synchronized boolean isCompleted() {
    return value >= maxNumber;
  }

  public synchronized void print(String threadName) {

    System.out.println(threadName + " - " + value);
    value++;
  }
}
