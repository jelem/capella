package com.hillel.task_2;

import com.hillel.task_1.Circle;
import com.hillel.task_1.Figure;
import com.hillel.task_1.Rectangle;
import com.hillel.task_1.Square;

public class Main {

  public static void main(String[] args) {
    Worker[] firm = new Worker[5];
    firm[0] = new Boss("Andrey", 20000, 32);
    firm[1] = new Programer("Zahar",10000, 23);
    firm[2] = new Programer("Maria", 10000, 25);
    firm[3] = new Programer("Irina", 10000, 22);
    firm[4] = new Tester("Al-Hazred", 15000, 29);

    int numb = 1;
    for (Worker firme : firm) {
      System.out.println("\nWorker # " + numb + ": " + firme.getName() + ", " + firme.getZarplata() + " grn., age " + firme.getAge() );
      firme.work();
      numb++;
    }
  }
}
