package com.hillel.person;

import java.io.Serializable;
import java.util.Objects;

public class Country implements Serializable, Cloneable {

  private static final long serialVersionUID = 1;
  private String name;

  public Country(String name) {
    this.name = name;
  }

  public Country(Country country) {
    this.name = String.valueOf(country.name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Country)) {
      return false;
    }
    Country country = (Country) obj;
    return Objects.equals(name, country.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Country{"
        + "name='" + name + '\''
        + '}';
  }

  @Override
  protected Country clone() throws CloneNotSupportedException {
    return (Country) super.clone();
  }
}
