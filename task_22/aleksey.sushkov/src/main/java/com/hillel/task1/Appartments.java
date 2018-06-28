package com.hillel.task1;

import java.util.Objects;

public class Appartments {

  private int number;
  private int price;
  private String quality;

  public Appartments(int number, int price, String quality) {
    this.number = number;
    this.price = price;
    this.quality = quality;
  }


  @Override
  public boolean equals(Object o1) {
    if (this == o1) {
      return true;
    }
    if (o1 == null || getClass() != o1.getClass()) {
      return false;
    }

    Appartments that = (Appartments) o1;

    if (number != that.number) {
      return false;
    }
    if (price != that.price) {
      return false;
    }
    return quality.equals(that.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, price, quality);
  }

  @Override
  public String toString() {
    return "Appartments\n" +
        "\tnumber: " + number +
        "\n\tprice: " + price +
        "\n\tquality: " + quality;
  }
}
