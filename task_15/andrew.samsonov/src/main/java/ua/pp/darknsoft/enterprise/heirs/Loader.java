package ua.pp.darknsoft.enterprise.heirs;

import ua.pp.darknsoft.enterprise.Tools;
import ua.pp.darknsoft.enterprise.Worker;

public class Loader extends Worker {

  private String tool;

  public Loader(String name, String position) {
    super(name, position);
  }

  public Loader(String name, String position, Tools tool) {
    super(name, position);
    this.tool = tool.toString().toLowerCase();
  }

  @Override
  public void doWork() {
    if (tool != null) {
      if (tool.charAt(tool.length() - 1) == 'а') {
        System.out.println("Грузить в " + tool.substring(0, tool.toString().length() - 1) + "у");
      } else {
        System.out.println("Грузить в " + tool);
      }
    } else {
      System.out.println("Носить в руках");
    }
  }

  @Override
  public String toString() {
    return "Разнорабочий - " + super.getPosition();
  }
}
