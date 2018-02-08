package com.hillel;

import java.util.Objects;

public class Author {

  private int id;
  private String name;
  private String birthday;

  public Author(int id, String name, String birthday) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
  }

  public int getId() {
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
    Author author = (Author) object;
    return id == author.id
        && Objects.equals(name, author.name)
        && Objects.equals(birthday, author.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Author{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", birthday='" + birthday + '\''
        + '}';
  }
}