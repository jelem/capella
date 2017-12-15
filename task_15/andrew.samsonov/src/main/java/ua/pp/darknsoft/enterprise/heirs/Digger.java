package ua.pp.darknsoft.enterprise.heirs;

import ua.pp.darknsoft.enterprise.Tools;
import ua.pp.darknsoft.enterprise.Worker;

public class Digger extends Worker {

  private Tools tool;

  public Digger(String name, String position) {
    super(name, position);
  }

  public Digger(String name, String position, Tools tool) {
    super(name, position);
    this.tool = tool;
  }

  @Override
  public void doWork() {
    if (tool != null) {
      System.out.println(("Копать " + tool.toString().substring(0, tool.toString().length()-1) + "ой").toLowerCase());
    } else {
      System.out.println("Копать руками");
    }
  }
  @Override
  public String toString() {
    return "Разнорабочий - " + super.getPosition();
  }
}
