package ua.pp.darknsoft.enterprise;

public class Worker {

  private String name;
  private String position;

  public Worker(String name, String position) {
    this.name = name;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public void doWork() {
    System.out.println("Стоять, курить");
  }
}
