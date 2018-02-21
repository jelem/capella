package ua.pp.darknsoft;

import java.io.Serializable;

public class PersonalData implements Serializable, Cloneable {

  private static final long serialVersionUID = 1556835869480L;

  private String passport;
  private String address;
  private int age;

  public PersonalData(String passport, String address, int age) {
    this.passport = passport;
    this.address = address;
    this.age = age;
  }

  public PersonalData(PersonalData personalData) {
    this.passport = personalData.passport;
    this.address = personalData.address;
    this.age = personalData.age;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof PersonalData)) {
      return false;
    }

    PersonalData that = (PersonalData) obj;

    if (age != that.age) {
      return false;
    }
    if (!passport.equals(that.passport)) {
      return false;
    }
    return address.equals(that.address);
  }

  @Override
  public int hashCode() {
    int result = passport.hashCode();
    result = 31 * result + address.hashCode();
    result = 31 * result + age;
    return result;
  }

  @Override
  public String toString() {
    return "PersonalData{"
        + "passport='" + passport + '\''
        + ", address='" + address + '\''
        + ", age=" + age
        + '}';
  }
}
