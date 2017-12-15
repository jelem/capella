package ua.pp.darknsoft.enterprise;

import ua.pp.darknsoft.enterprise.heirs.Digger;
import ua.pp.darknsoft.enterprise.heirs.Foreman;
import ua.pp.darknsoft.enterprise.heirs.Loader;

public class Main {

  public static void main(String[] args) {
    final Worker boss = new Foreman("Евгениевич", "Технадзор");
    final Worker workerOne = new Digger("Петро", "Землекоп", Tools.ЛОПАТА);
    final Worker workerTwo = new Digger("Иван", "Землекоп", Tools.КИРКА);
    final Worker workerThree = new Loader("Степан", "Грузчик", Tools.ТЕЛЕЖКА);
    final Worker workerFour = new Loader("Эй ты", "Разнорабочий");

    Worker[] company = new Worker[5];
    company[0] = boss;
    company[1] = workerOne;
    company[2] = workerTwo;
    company[3] = workerThree;
    company[4] = workerFour;

    for (Worker worker : company) {
      System.out.print(worker + ": ");
      worker.doWork();
    }

  }
}
