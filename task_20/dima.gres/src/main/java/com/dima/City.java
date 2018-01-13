package com.dima;

public class City {
  private String country;
  private String district;
  private int population;

  public City(String country, String district, int population) {
    this.country = country;
    this.district = district;
    this.population = population;
  }

  public String getCountry() {
    return country;
  }

  public String getDistrict() {
    return district;
  }

  public int getPopulation() {
    return population;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    City tmp = (City) o;
    if (!this.country.equals(tmp.country) || !this.district.equals(tmp.district)
        || this.population != tmp.population || this.country == null
        || tmp.country == null || this.district == null
        || tmp.district == null) {
      return false;
    }
    return true;
  }
}
