package ua.pp.darknsoft.entity;

import java.math.BigDecimal;

public class Book {

  private int id;
  private String name;
  private int authorId;
  private BigDecimal price;

  public Book(String name, int authorId, BigDecimal price) {
    this.name = name;
    this.authorId = authorId;
    this.price = price;
  }

  public Book(int id, String name, int authorId, BigDecimal price) {
    this(name, authorId, price);
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAuthorId() {
    return authorId;
  }

  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book)) {
      return false;
    }

    Book book = (Book) obj;

    if (id != book.id) {
      return false;
    }
    if (authorId != book.authorId) {
      return false;
    }
    if (!name.equals(book.name)) {
      return false;
    }
    return price != null ? price.equals(book.price) : book.price == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + name.hashCode();
    result = 31 * result + authorId;
    result = 31 * result + (price != null ? price.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Book{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", authorId=" + authorId
        + ", price=" + price
        + '}';
  }

}
