package com.dima;

public class City {
  private String country;
  private String district;

  public City(String country, String district) {
    this.country = country;
    this.district = district;
  }

  public String getCountry() {
    return country;
  }

  public String getDistrict() {
    return district;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    City tmp = (City) o;
    if (!this.country.equals(tmp.country) || !this.district.equals(tmp.district)
        || this.country == null || tmp.country == null
        || this.district == null || tmp.district == null) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "City{" +
        "country='" + country + '\'' +
        ", district='" + district + '\'' +
        '}';
  }
}