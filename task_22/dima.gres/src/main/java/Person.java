public class Person {

  private String name;
  private String surname;
  private int age;

  private  Person() {
    this.name = Builder.firstName;
    this.surname = Builder.secondName;
    this.age = Builder.old;
  }

  public static class Builder {
    private static String firstName;
    private static String secondName;
    private static int old;

    public Builder name(String name) {
      Builder.firstName = name;
      return this;
    }

    public Builder surname(String surname) {
      Builder.secondName = surname;
      return this;
    }

    public Builder age(int age) {
      Builder.old = age;
      return this;
    }

    public Person build() {
      return new Person();
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
