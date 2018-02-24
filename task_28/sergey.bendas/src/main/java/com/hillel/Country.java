package com.hillel;

import java.io.Serializable;
import java.util.Objects;

public class Country implements Serializable, Cloneable {

  private static final long serialVersionUID = -4181776759928840698L;
  private String name;

  public Country(String name) {
    this.name = name;
  }

  public Country(Country country) {
    this.name = country.name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Country country = (Country) object;
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
