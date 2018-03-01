package ua.pp.darknsoft;

public class Count {

  private final int id;
  private String name;
  private static int countIt = 0;


  public Count(int id) {
    this.id = id;

  }

  public static int getCountIt() {
    return countIt;
  }

  public static void setCountIt() {
    countIt++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Count{"
        + "Step =" + id
        + ", ThreadName=" + name
        + "} - " + countIt;
  }
}
