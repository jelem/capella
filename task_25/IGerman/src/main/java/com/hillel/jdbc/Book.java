package com.hillel.jdbc;

import java.math.BigDecimal;

public class Book {

  private String name;
  private BigDecimal price;
  private int authorId;

  public Book(String name, BigDecimal price, int authorId) {
    this.name = name;
    this.price = price;
    this.authorId = authorId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public int getAuthorId() {
    return authorId;
  }

  public void setAuthorId(int authorId) {
    this.authorId = authorId;
  }
}
