package com.hillel.person;

import java.io.Serializable;
import java.util.Objects;

public class PersonalData implements Serializable, Cloneable {

  private static final long serialVersionUID = 1;
  private String passport;
  private String address;
  private int age;

  public PersonalData(String passport, String address, int age) {
    this.passport = passport;
    this.address = address;
    this.age = age;
  }

  public PersonalData(PersonalData personalData) {
    this.passport = String.valueOf(personalData.passport);
    this.address = String.valueOf(personalData.address);
    this.age = personalData.age;
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
    return age == that.age
        && Objects.equals(passport, that.passport)
        && Objects.equals(address, that.address);
  }

  @Override
  public int hashCode() {

    return Objects.hash(passport, address, age);
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
