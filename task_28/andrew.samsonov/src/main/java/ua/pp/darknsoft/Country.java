package ua.pp.darknsoft;

import java.io.Serializable;

public class Country implements Serializable, Cloneable {

  private static final long serialVersionUID = 1456838657954L;

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

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Country) super.clone();
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

    return name.equals(country.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return "Country{"
        + "name='" + name + '\''
        + '}';
  }
}
