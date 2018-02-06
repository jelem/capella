package ua.pp.darknsoft;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;
import ua.pp.darknsoft.input.Console;
import ua.pp.darknsoft.jdbc.DBUtil;
import ua.pp.darknsoft.jdbc.InsertData;
import ua.pp.darknsoft.jdbc.InsertDataImpl;
import ua.pp.darknsoft.jdbc.SelectAuthors;
import ua.pp.darknsoft.jdbc.SelectAuthorsImpl;
import ua.pp.darknsoft.jdbc.SelectConsumer;
import ua.pp.darknsoft.jdbc.SelectConsumerImpl;
import ua.pp.darknsoft.jdbc.SelectData;
import ua.pp.darknsoft.jdbc.SelectDataImpl;

public class Main {

  public static void main(String[] args) {
    SelectConsumer selectConsumer = new SelectConsumerImpl();
    SelectAuthors selectAuthors = new SelectAuthorsImpl();
    final SelectData selectData = new SelectDataImpl();

    System.out.println(selectConsumer.getConsumerById(1));
    System.out.println(selectAuthors.getAuthorById(1));
    System.out.println(selectConsumer.getConsumerByFirstName("Vasiliy"));

    System.out.println("########################### getAllBooks #################################");
    for (Book book : selectData.getAllBooks()) {
      DBUtil.printFullBook(book);
    }

    System.out.println("###################### getAuthorsLessThanYears ##########################");
    for (Author theAuthor : selectData.getAuthorsLessThanYears(50)) {
      System.out.println(theAuthor);
    }

    System.out.println("################## getBooksByExpensivePriceLimit ########################");
    for (Book book : selectData.getBooksByExpensivePriceLimit(3)) {
      DBUtil.printFullBook(book);
    }

    System.out.println("######################## getBooksByConsumer #############################");
    final Consumer consumer = selectConsumer.getConsumerById(3);
    System.out.println("\t\t-=" + consumer.getFirstName() + " " + consumer.getLastName() + "=-");
    for (Book book : selectData.getBooksByConsumer(consumer)) {
      DBUtil.printFullBook(book);
    }

    System.out.println("################## calculateCollectionPriceByAuthor #####################");
    Author author = selectAuthors.getAuthorById(3);
    System.out.println("\t\t-=" + author.getFirstName() + " " + author.getLastName() + "=-");
    System.out.println("Collection price: " + selectData.calculateCollectionPriceByAuthor(author));

    InsertData insertData = new InsertDataImpl();
    insertData.addConsumer(new Console().readConsumer());

  }
}
