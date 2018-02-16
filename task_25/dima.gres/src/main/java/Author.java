import java.util.Objects;

public class Author {

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
}
