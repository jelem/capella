package com.hillel;

import java.util.Objects;

public class Place {

  private int carriage;
  private int number;

  public Place(int carriage, int number) {
    this.carriage = carriage;
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public int getCarriage() {
    return carriage;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Place place = (Place) object;
    return carriage == place.carriage
        && number == place.number;
  }

  @Override
  public int hashCode() {

    return Objects.hash(number);
  }

  @Override
  public String toString() {
    return "Place{"
        + "carriage=" + carriage
        + ", number=" + number
        + '}';
  }
}
