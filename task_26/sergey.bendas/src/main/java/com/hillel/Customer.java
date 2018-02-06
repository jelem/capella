package com.hillel;

import java.util.Objects;

public class Customer {

  private int id;
  private String name;
  private String birthday;

  public Customer(Integer id, String name, String birthday) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getBirthday() {
    return birthday;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Customer customer = (Customer) object;
    return Objects.equals(id, customer.id)
        && Objects.equals(name, customer.name)
        && Objects.equals(birthday, customer.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Customer{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", birthday='" + birthday + '\''
        + '}';
  }
}