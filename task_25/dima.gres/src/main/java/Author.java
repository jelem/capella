import java.util.Objects;

public class Author {

  private int id;
  private String name;
  private int age;

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Author(){

  }

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

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Author)) {
      return false;
    }

    Author author = (Author) object;
    return getId() == author.getId()
        && getAge() == author.getAge()
        && Objects.equals(getName(), author.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName(), getAge());
  }

  @Override
  public String toString() {
    return "Author{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", age="
        + age
        + '}'
        ;
  }
}
