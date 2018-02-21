package ua.pp.darknsoft;

import java.io.Serializable;

public class City implements Serializable, Cloneable {

  private static final long serialVersionUID = 1356948860954L;

  private String name;
  private Country country;

  public City(String name, Country country) {
    this.name = name;
    this.country = country;
  }

  public City(City city) {
    this.name = city.name;
    this.country = new Country(city.country);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    City city = (City) super.clone();
    city.country = (Country) this.country.clone();
    return city;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof City)) {
      return false;
    }

    City city = (City) obj;

    if (!name.equals(city.name)) {
      return false;
    }
    return country.equals(city.country);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + country.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "City{"
        + "name='" + name + '\''
        + ", country=" + country
        + '}';
  }
}
