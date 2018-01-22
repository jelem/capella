import java.util.Objects;

public class Person {
  public static final int Alpha = 'A';
  public static final int alpha = 'a';
  private String name;
  private String surname;
  private int age;

  private Person(Builder builder) {
    this.name = builder.firstName;
    this.surname = builder.secondName;
    this.age = builder.old;
  }

  public static class Builder {
    private String firstName;
    private String secondName;
    private int old;

    public Builder name(String name) {
      this.firstName = name;
      return this;
    }

    public Builder surname(String surname) {
      this.secondName = surname;
      return this;
    }

    public Builder age(int old) {
      this.old = old;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Person)) {
      return false;
    }
    Person person = (Person) object;
    return getAge() == person.getAge()
        && Objects.equals(getName(), person.getName())
        && Objects.equals(getSurname(), person.getSurname());
  }

  @Override
  public int hashCode() {
    char firstLitera = getSurname().charAt(0);
    return firstLitera >= 'A' && firstLitera <= 'Z' ? firstLitera - Alpha : firstLitera - alpha;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", age=" + age +
        '}';
  }
}
