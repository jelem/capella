public class Person {
  private static final int Alpha = 'A';
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


}
