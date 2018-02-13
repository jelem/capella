package ua.pp.darknsoft.entity;

import java.math.BigDecimal;

public class BookCollection {

  private BigDecimal price;
  private Author author;
  private int numberOfBooks;

  public BookCollection(BigDecimal price, Author author, int numberOfBooks) {
    this.price = price;
    this.author = author;
    this.numberOfBooks = numberOfBooks;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public int getAuthorId() {
    return author.getId();
  }

  public Author getAuthor() {
    return new Author(author.getId(), author.getFirstName(), author.getLastName(), author.getAge());
  }

  public int getNumberOfBooks() {
    return numberOfBooks;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof BookCollection)) {
      return false;
    }

    BookCollection that = (BookCollection) obj;

    if (numberOfBooks != that.numberOfBooks) {
      return false;
    }
    if (!price.equals(that.price)) {
      return false;
    }
    return author.equals(that.author);
  }

  @Override
  public int hashCode() {
    int result = price.hashCode();
    result = 31 * result + author.hashCode();
    result = 31 * result + numberOfBooks;
    return result;
  }

  @Override
  public String toString() {
    return "BookCollection{"
        + "price=" + price
        + ", author=" + author.getFirstName()
        + " "
        + author.getLastName()
        + ", numberOfBooks="
        + numberOfBooks + '}';
  }
}
