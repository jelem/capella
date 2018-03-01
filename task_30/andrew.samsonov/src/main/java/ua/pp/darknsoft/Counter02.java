package ua.pp.darknsoft;

import java.util.concurrent.LinkedBlockingQueue;

public class Counter02 implements Runnable {

  private LinkedBlockingQueue<Count> queue1 = new LinkedBlockingQueue();
  private LinkedBlockingQueue<Count> queue2 = new LinkedBlockingQueue();

  public Counter02(LinkedBlockingQueue queue1, LinkedBlockingQueue queue2) {
    this.queue1 = queue1;
    this.queue2 = queue2;
  }

  @Override
  public void run() {
    try {
      while (!Thread.interrupted()) {
        Count count = queue1.take();
        count.setName("Counter_2");
        count.setCountIt();
        System.out.println(count);
        queue2.put(count);
      }
    } catch (InterruptedException ex) {
      System.out.println("COUNTER_2 OFF");
    }

  }

}
