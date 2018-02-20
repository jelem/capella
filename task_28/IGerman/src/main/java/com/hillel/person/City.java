package com.hillel.person;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable, Cloneable {

  private static final long serialVersionUID = 1;
  private String name;
  private Country country;

  public City(String name, Country country) {
    this.name = name;
    this.country = country;
  }

  public City(City city) {
    this.name =  String.valueOf(city.name);
    this.country = new Country(city.country);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof City)) {
      return false;
    }
    City city = (City) obj;
    return Objects.equals(name, city.name)
        && Objects.equals(country, city.country);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, country);
  }

  @Override
  public String toString() {
    return "City{"
        + "name='" + name + '\''
        + ", country=" + country
        + '}';
  }

  @Override
  protected City clone() throws CloneNotSupportedException {
    City city = (City) super.clone();
    city.country = this.country.clone();
    return city;
  }
}
