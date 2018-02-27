public class Student {
  private  String lastname;
  private  String firstname;
  private int age;

  public Student(String lastname, String firstname, int age) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.age = age;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public int getAge() {
    return age;
  }

  public Student() {
  }

  public void setLastname(String lastname) {

    this.lastname = lastname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "\n\t<student>"
        + "\n\t\t<lastname>"
        + lastname
        + "</lastname>"
        + "\n\t\t<firstname>"
        + firstname
        + "</firstname>"
        + "\n\t\t<age>"
        + age
        + "</age>"
        + "\n\t</student>"
        ;
  }
}
