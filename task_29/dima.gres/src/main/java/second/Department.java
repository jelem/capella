package second;


import java.util.ArrayList;

public class Department {

  private String name;
  private Department child;
  private Department perent;

  public Department(String name) {
    this.name = name;
  }

  public Department(String name, Department child, Department perent) {
    this.name = name;
    this.child = child;
    this.perent = perent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getChild() {
    return child;
  }

  public void setChild(Department child) {
    this.child = child;
  }

  public Department getPerent() {
    return perent;
  }

  public void setPerent(Department perent) {
    this.perent = perent;
  }


  @Override
  public String toString() {
    return "name='"
        + name
        + '\''
        ;
  }
}
