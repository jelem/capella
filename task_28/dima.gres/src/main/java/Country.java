import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Country implements Externalizable, Cloneable {
  private static final long serialVersionUID = -1;

  private String name;

  public Country() {
  }

  public Country(Country country) {
    this.name = country.name;
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

  protected Country copyCountry() throws CloneNotSupportedException {
    return (Country) super.clone();
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

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {
    objectOutput.writeObject(name);
  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    name = (String) objectInput.readObject();
  }
}
