package ua.pp.darknsoft;

import ua.pp.darknsoft.jdbc.SelectAuthors;
import ua.pp.darknsoft.jdbc.SelectAuthorsImpl;
import ua.pp.darknsoft.jdbc.SelectBooks;
import ua.pp.darknsoft.jdbc.SelectBooksImpl;
import ua.pp.darknsoft.jdbc.SelectConsumer;
import ua.pp.darknsoft.jdbc.SelectConsumerImpl;

public class Main {

  public static void main(String[] args) {
    SelectAuthors author = new SelectAuthorsImpl();
    SelectConsumer consumer = new SelectConsumerImpl();
    SelectBooks books = new SelectBooksImpl();

    System.out.println(author.getAuthorById(1));
    System.out.println(consumer.getConsumerById(1));
    System.out.println(books.getBookById(1));
  }
}
