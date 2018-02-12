import java.util.Objects;

public class City {
  private String name;
  private Country country;

  public City(String name, Country country) {
    this.name = name;
    this.country = country;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof City)) {
      return false;
    }

    City city = (City) object;
    return Objects.equals(getName(), city.getName())
        && Objects.equals(getCountry(), city.getCountry());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getName(), getCountry());
  }

  @Override
  public String toString() {
    return "City{"
        + "name='"
        + name
        + '\''
        + ", country="
        + country
        + '}'
        ;
  }

  public City() {
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  protected City copyCity() throws CloneNotSupportedException {

    return (City) super.clone();
  }
}
