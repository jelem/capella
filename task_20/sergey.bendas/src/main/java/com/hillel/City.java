package com.hillel;

import java.util.Objects;

public class City {

  private String name;
  private double square;

  @Override
  public String toString() {
    return "City{" + "name='" + name + '\'' + '}';
  }

  public String getName() {
    return name;
  }

  public double getSquare() {
    return square;
  }

  public City(String name, double square) {
    this.name = name;
    this.square = square;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    City city = (City) object;
    return Double.compare(city.square, square) == 0
        && Objects.equals(name, city.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, square);
  }
}