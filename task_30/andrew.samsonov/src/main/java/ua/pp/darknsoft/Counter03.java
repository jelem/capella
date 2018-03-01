package ua.pp.darknsoft;

import java.util.concurrent.LinkedBlockingQueue;

public class Counter03 implements Runnable {

  private LinkedBlockingQueue<Count> queue2 = new LinkedBlockingQueue();

  public Counter03(LinkedBlockingQueue<Count> queue2) {
    this.queue2 = queue2;
  }

  @Override
  public void run() {
    try {
      while (!Thread.interrupted()) {
        Count count = queue2.take();
        count.setName("Counter_3");
        count.setCountIt();
        System.out.println(count);
      }
    } catch (InterruptedException ex) {
      System.out.println("COUNTER_3 OFF");
    }

  }

}
