package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;

import java.util.List;

public interface SelectData {

  List<Book> getAllBooks();

  List<Author> getAuthorsLessThanYears(int age);

  List<Book> getBooksByExpensivePriceLimit(int limit);

  List<Book> getBooksByConsumer(Consumer consumer);

  List<Book> getCollectionByAuthor(Author author);
}
