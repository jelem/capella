
public class Author {
  public static final int NOFOUND = -1;

  private int id;
  private String name;
  private int age;

  public Author(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }


}
