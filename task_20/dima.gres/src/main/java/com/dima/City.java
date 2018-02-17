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
  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }

    City tmp = (City) obj;
    if ( this.country == null || tmp.country == null
        || this.district == null || tmp.district == null
        || !this.country.equals(tmp.country) || !this.district.equals(tmp.district)
        ) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "City{"
        + "country='"
        + country
        + '\''
        + ", district='"
        + district
        + '\''
        + '}';
  }
}