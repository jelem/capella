package ua.pp.darknsoft;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    int stop = 100;
    LinkedBlockingQueue<Count> q1 = new LinkedBlockingQueue<>();
    LinkedBlockingQueue<Count> q2 = new LinkedBlockingQueue<>();
    ExecutorService exec = Executors.newCachedThreadPool();

    exec.execute(new Counter01(q1, exec, stop));
    exec.execute(new Counter02(q1, q2));
    exec.execute(new Counter03(q2));


  }

}
