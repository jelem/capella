package com.hillel;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable, Cloneable {

  private static final long serialVersionUID = 5241552621724796758L;
  private String name;
  private Country country;

  public City(String name, Country country) {
    this.name = name;
    this.country = country;
  }

  public City(City city) {
    this.name = city.name;
    //Shallow cloning is used,
    //because the new country does not appear
    //when a new city is built
    this.country = city.country;
  }

  public String getName() {
    return name;
  }

  public Country getCountry() {
    return country;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    City city = (City) object;
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
    return (City) super.clone();
  }
}
