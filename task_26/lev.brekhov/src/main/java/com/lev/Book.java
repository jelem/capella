package com.lev;

public class Book {

  private String name;
  private int price;

  public Book(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}
