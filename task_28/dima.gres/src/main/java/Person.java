public class Person {
  private String firstname;
  private String laststname;
  private City city;
  private PersonalData personalData;

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
}
