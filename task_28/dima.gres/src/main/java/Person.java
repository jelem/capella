import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Person implements Externalizable, Cloneable {
  private static final long serialVersionUID = -1;

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

  public Person(Person person) {
    this.firstname = person.firstname;
    this.laststname = person.laststname;
    this.personalData = new PersonalData(person.personalData);
    this.city = new City(person.city);
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

  protected Person copyPerson() throws CloneNotSupportedException {
    Person person = (Person) super.clone();
    person.city = this.city.copyCity();
    person.personalData = this.personalData.copyData();
    return  person;
  }

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {
    objectOutput.writeObject(firstname);
    objectOutput.writeObject(laststname);
    objectOutput.writeObject(city);
    objectOutput.writeObject(personalData);
  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    firstname =  (String) objectInput.readObject();
    laststname =  (String) objectInput.readObject();
    city =  (City) objectInput.readObject();
    personalData =  (PersonalData) objectInput.readObject();
  }
}
