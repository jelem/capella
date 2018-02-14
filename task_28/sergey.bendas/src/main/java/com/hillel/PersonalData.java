package com.hillel;

import java.io.Serializable;
import java.util.Objects;

public class PersonalData implements Serializable, Cloneable {

  private static final long serialVersionUID = 480695631934513441L;
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

  public String getPassport() {
    return passport;
  }

  public String getAdress() {
    return address;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    PersonalData that = (PersonalData) object;
    return Objects.equals(passport, that.passport);
  }

  @Override
  public int hashCode() {

    return Objects.hash(passport);
  }

  @Override
  public String toString() {
    return "PersonalData{"
        + "passport='" + passport + '\''
        + ", address='" + address + '\''
        + ", age=" + age
        + '}';
  }

  @Override
  protected PersonalData clone() throws CloneNotSupportedException {
    return (PersonalData) super.clone();
  }
}
