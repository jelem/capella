package ua.pp.darknsoft;

import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;
import ua.pp.darknsoft.jdbc.DBUtil;
import ua.pp.darknsoft.jdbc.SelectAuthors;
import ua.pp.darknsoft.jdbc.SelectAuthorsImpl;
import ua.pp.darknsoft.jdbc.SelectConsumer;
import ua.pp.darknsoft.jdbc.SelectConsumerImpl;
import ua.pp.darknsoft.jdbc.SelectData;
import ua.pp.darknsoft.jdbc.SelectDataImpl;

public class Main {

  public static void main(String[] args) {
    SelectConsumer selectConsumer = new SelectConsumerImpl();
    SelectData selectData = new SelectDataImpl();
    
    System.out.println(selectConsumer.getConsumerById(1));

    for (Book book : selectData.getAllBooks()) {
      DBUtil.printFullBook(book);
    }
    System.out.println("#########################################################################");
    for (Book book : selectData.getBooksByExpensivePriceLimit(3)) {
      DBUtil.printFullBook(book);
    }
    System.out.println("#########################################################################");
    final Consumer consumer = selectConsumer.getConsumerById(3);
    System.out.println("\t\t-=" + consumer.getFirstName() + " " + consumer.getLastName() + "=-");
    for (Book book : selectData.getBooksByConsumer(consumer)) {
      DBUtil.printFullBook(book);
    }
  }
}
