import java.util.Objects;

public class Person {
  private String firstname;
  private String laststname;
  private City city;
  private PersonalData personalData;

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Person)) {
      return false;
    }

    Person person = (Person) object;
    return Objects.equals(getFirstname(), person.getFirstname())
        && Objects.equals(getLaststname(), person.getLaststname())
        && Objects.equals(getCity(), person.getCity())
        && Objects.equals(getPersonalData(), person.getPersonalData());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getFirstname(), getLaststname(), getCity(), getPersonalData());
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstname='"
        + firstname
        + '\''
        + ", laststname='"
        + laststname
        + '\''
        + ", city="
        + city
        + ", personalData="
        + personalData
        + '}'
        ;
  }

  public Person() {
  }

  public Person(String firstname, String laststname, City city, PersonalData personalData) {
    this.firstname = firstname;
    this.laststname = laststname;
    this.city = city;
    this.personalData = personalData;
  }

  public City getCity() {

    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public PersonalData getPersonalData() {
    return personalData;
  }

  public void setPersonalData(PersonalData personalData) {
    this.personalData = personalData;
  }

  public String getLaststname() {
    return laststname;
  }

  public void setLaststname(String laststname) {
    this.laststname = laststname;
  }

  public String getFirstname() {

    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  protected Person clone() throws CloneNotSupportedException {
    Person person = (Person) super.clone();
    person.city = this.city.copyCity();
    person.personalData = this.personalData.copyData();
    return  person;
  }
}
