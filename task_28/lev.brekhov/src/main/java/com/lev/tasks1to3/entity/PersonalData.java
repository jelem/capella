package com.lev.tasks1to3.entity;

import java.io.Serializable;
import java.util.Objects;

public class PersonalData implements Serializable {

  private static final long serialVersionUID = -1;
  private String passport;
  private String address;
  private int age;

  public PersonalData(String passport, String address, int age) {
    this.passport = passport;
    this.address = address;
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
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
    return "PersonalData{" + "passport='" + passport
        + '\'' + ", address='" + address + '\''
        + ", age=" + age + '}';
  }

  public String getPassport() {
    return passport;
  }

  public String getAddress() {
    return address;
  }

  public int getAge() {
    return age;
  }
}
