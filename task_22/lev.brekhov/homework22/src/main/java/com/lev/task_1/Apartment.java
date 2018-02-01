package com.lev.task_1;

import java.util.Objects;

public class Apartment {

  private int number;
  private String level;

  public Apartment(int number, String level) {
    this.number = number;
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apartment apartment = (Apartment) o;
    return number == apartment.number &&
        Objects.equals(level, apartment.level);
  }

  @Override
  public int hashCode() {

    return Objects.hash(number, level);
  }

  @Override
  public String toString() {
    return "Apartment{" +
        "number=" + number +
        ", level='" + level + '\'' +
        '}';
  }
}
