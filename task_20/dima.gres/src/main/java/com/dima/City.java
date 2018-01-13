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
}
