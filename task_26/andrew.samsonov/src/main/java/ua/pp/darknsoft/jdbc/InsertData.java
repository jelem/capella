package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;

public interface InsertData {

  void addAuthor(Author author);

  void addBook(Book book);

  void addConsumer(Consumer consumer);

}
