package com.hillel;

import java.util.Objects;

public class City implements Comparable<City> {

  String name;
  String country;

  public City(String name, String country) {
    this.name = name;
    this.country = country;
  }

  @Override
  public String toString() {
    return "City{"
        + "name='" + name + '\''
        + ", country='" + country + '\''
        + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if ((obj.getClass() != this.getClass())) {
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
  public int compareTo(City obj) {
    return name.compareToIgnoreCase(obj.name);
  }
}
