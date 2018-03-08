package ua.pp.darknsoft;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Counter01 implements Runnable {
  private LinkedBlockingQueue<Count> queue1 = new LinkedBlockingQueue();
  private int id = 0;
  private final int stop;
  private ExecutorService es;


  public Counter01(LinkedBlockingQueue queue1, ExecutorService es, int stop) {
    this.queue1 = queue1;
    this.es = es;
    this.stop = stop;
  }

  @Override
  public void run() {
    try {
      while (!Thread.interrupted()) {
        TimeUnit.MILLISECONDS.sleep(50);
        Count count = new Count(id++);
        count.setName("Counter_1");
        count.setCountIt();
        System.out.println(count);
        if (Count.getCountIt() < stop) {
          queue1.put(count);
        } else {
          es.shutdownNow();
        }

      }
    } catch (InterruptedException ex) {
      System.out.println("COUNTER_1 INTERRUPTED");
    }
    System.out.println("COUNTER_1 OFF");
  }

}
