package com.lev.tasks1to3.entity;

import java.io.Serializable;
import java.util.Objects;

public class Country implements Serializable {

  private static final long serialVersionUID = -1;
  private String name;

  public Country(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
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
    return "Country{" + "name='" + name + '\'' + '}';
  }
}
