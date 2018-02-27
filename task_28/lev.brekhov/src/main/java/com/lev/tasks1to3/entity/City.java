package com.lev.tasks1to3.entity;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {

  private static final long serialVersionUID = -1;
  private String name;
  private Country country;

  public City(String name, Country country) {
    this.name = name;
    this.country = country;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    City city = (City) obj;
    return Objects.equals(name, city.name) &&
        Objects.equals(country, city.country);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, country);
  }

  @Override
  public String toString() {
    return "City{"
        + "name='" + name + '\''
        + ", country=" + country + '}';
  }

  public String getName() {
    return name;
  }

  public Country getCountry() {
    return country;
  }
}
