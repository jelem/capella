import java.util.Objects;

public class PersonalData {
  private String passport;
  private String adress;
  private int  age;

  public PersonalData() {
  }

  public PersonalData(String passport, String adress, int age) {

    this.passport = passport;
    this.adress = adress;
    this.age = age;
  }

  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  @Override
  public String toString() {
    return "PersonalData{"
        + "passport='"
        + passport
        + '\''
        + ", adress='"
        + adress
        + '\''
        + ", age="
        + age
        + '}'
        ;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof PersonalData)) {
      return false;
    }

    PersonalData that = (PersonalData) object;
    return getAge() == that.getAge()
        && Objects.equals(getPassport(), that.getPassport())
        && Objects.equals(getAdress(), that.getAdress());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getPassport(), getAdress(), getAge());
  }

  public String getAdress() {

    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  protected PersonalData copyData() throws CloneNotSupportedException {
    return  (PersonalData) super.clone();
  }
}
