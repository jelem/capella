import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class City implements Externalizable, Cloneable {
  private static final long serialVersionUID = -1;

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
    City newCity = (City) super.clone();
    newCity.country = this.country.copyCountry();
    return newCity;
  }

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {
    objectOutput.writeObject(name);
    objectOutput.writeObject(country);
  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    name = (String) objectInput.readObject();
    country = (Country) objectInput.readObject();
  }
}
