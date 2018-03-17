package com.lev;

public class City {
  private String country;
  private String city;

  public City(String country, String city) {
    this.country = country;
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  @Override
  public String toString() {
    return "City{" + "country='"
        + country + '\'' + ", city='"
        + city + '\'' + '}';
  }
}
