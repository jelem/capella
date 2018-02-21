package com.hillel;

import java.util.Objects;

public class City {

  private String cityname;
  private int population;

  public City(String cityname, int population) {
    this.cityname = cityname;
    this.population = population;
  }

  public String getCityname() {
    return cityname;
  }


  @Override
  public String toString() {
    return cityname + ", pop. " + population;
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

    if (population != city.population) {
      return false;
    }

    boolean citynames = Objects.equals(this.cityname, city.cityname);
    boolean populations = this.population == city.population;

    return citynames && populations;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityname, population);
  }
}
