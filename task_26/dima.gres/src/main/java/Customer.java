import java.util.Objects;

public class Customer {

  private int id;
  private String name;

  public Customer(){
  }

  public Customer(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Customer)) {
      return false;
    }

    Customer customer = (Customer) object;

    return getId() == customer.getId()
        && Objects.equals(getName(), customer.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName());
  }

  @Override
  public String toString() {
    return "Customer{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + '}'
        ;
  }
}
