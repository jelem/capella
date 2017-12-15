package ua.pp.darknsoft.enterprise.heirs;

import ua.pp.darknsoft.enterprise.Worker;

public class Foreman extends Worker {

  private String tool;

  public Foreman(String name, String position) {
    super(name, position);
  }

  public Foreman(String name, String position, String tool) {
    super(name, position);
    this.tool = tool;
  }

  @Override
  public void doWork() {
    if (tool != null) {
      System.out.println("Орать в " + tool);
    } else {
      System.out.println("Орать");
    }
  }

  @Override
  public String toString() {
    return "Прораб - " + super.getPosition();
  }
}
