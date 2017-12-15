package ua.pp.darknsoft.enterprise;

import ua.pp.darknsoft.enterprise.heirs.Digger;
import ua.pp.darknsoft.enterprise.heirs.Foreman;
import ua.pp.darknsoft.enterprise.heirs.Loader;

public class Main {

  public static void main(String[] args) {
    Worker boss = new Foreman("Евгениевич", "Технадзор");
    Worker workerOne = new Digger("Петро", "Землекоп", Tools.ЛОПАТА);
    Worker workerTwo = new Digger("Иван", "Землекоп", Tools.КИРКА);
    Worker workerThree = new Loader("Степан", "Грузчик", Tools.ТЕЛЕЖКА);
    Worker[] company = new Worker[5];
    company[0] = boss;
    company[1] = workerOne;
    company[2] = workerTwo;
    company[3] = workerThree;
    company[4] = new Worker("Эй ты", "Разнорабочий");

    for (Worker worker : company) {
      System.out.print(worker + ": ");
      worker.doWork();
    }

  }


}
