package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;

import java.util.List;

public class SelectDataImpl implements SelectData {

  @Override
  public List<Book> getAllBooks() {
    return null;
  }

  @Override
  public List<Author> getAuthorsLessThanYears(int age) {
    return null;
  }

  @Override
  public List<Book> getBooksByExpensivePriceLimit(int limit) {
    return null;
  }

  @Override
  public List<Book> getBooksByConsumer(Consumer consumer) {
    return null;
  }

  @Override
  public List<Book> getCollectionByAuthor(Author author) {
    return null;
  }
}
