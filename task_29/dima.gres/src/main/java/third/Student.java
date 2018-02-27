package third;

public class Student {
  private String name;
  private String location;
  private int age;

  public Student(String name, String location, int age) {
    this.name = name;
    this.location = location;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='"
        + name
        + '\''
        + ", location='"
        + location
        + '\''
        + ", age="
        + age
        + '}'
        + ' '
        ;
  }
}
