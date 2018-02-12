import java.util.Objects;

public class Country {
  private String name;

  public Country() {
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country(String name) {

    this.name = name;
  }

  @Override
  public String toString() {
    return "Country{"
        + "name='"
        + name
        + '\''
        + '}';
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Country)) {
      return false;
    }

    Country country = (Country) object;
    return Objects.equals(getName(), country.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getName());
  }
}
