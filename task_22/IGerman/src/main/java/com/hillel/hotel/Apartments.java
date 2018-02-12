package com.hillel.hotel;

import java.util.Objects;

public class Apartments {

  private String level;
  private Double costPerNight;
  private int number;

  Apartments(String level, Double costPerNight, int number) {
    this.level = level;
    this.costPerNight = costPerNight;
    this.number = number;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Apartments)) {
      return false;
    }
    Apartments that = (Apartments) object;
    return number == that.number
        && Objects.equals(level, that.level)
        && Objects.equals(costPerNight, that.costPerNight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, costPerNight, number);
  }

  @Override
  public String toString() {
    return "Apartments {"
        + "level = '" + level + '\''
        + ", costPerNight = " + costPerNight
        + ", number = " + number
        + '}';
  }
}
