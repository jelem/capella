package com.hillel;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class BookStore {

  private DataBase dataBase;

  public BookStore(Connection connection) {
    dataBase = new DataBase(connection);
  }

  public void addBook() throws Exception {
    String bookName = MyScanner.getString("Enter book name:");
    int bookPrice = MyScanner.getInt("Enter book price:");
    Author author = selectAuthor();
    if (author == null) {
      dataBase.insertBook(bookName, bookPrice);
    } else {
      dataBase.insertBook(bookName, bookPrice, author);
    }
  }

  public void addAuthor() {
    String authorName = MyScanner.getString("Enter author's name:");
    String authorBirthday = MyScanner.getString("Enter Author's birthday (YYYY-MM-DD)");
    if (isAuthorInBase(authorName, authorBirthday)) {
      System.out.println("Author is already in Base");
      if (!MyScanner.getString("Do You want to add? (y/n)").equals("y")) {
        return;
      }
    }
    dataBase.insertAuthor(authorName, authorBirthday);
  }

  private void addAuthor(String authorName) {
    String authorBirthday = MyScanner.getString("Enter Author's birthday (YYYY-MM-DD)");
    dataBase.insertAuthor(authorName, authorBirthday);
  }

  public void buyBook() throws Exception {
    Book book = selectBook();
    Customer customer = selectCustomer();
    LocalDate localDate = LocalDate.now();
    String currentDate =
        localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth();
    dataBase.insertSelling(book, customer, currentDate);
  }

  public void printTotalPrice() {
    Map<Author, Integer> authorPriceMap = dataBase.getTotalPrice();
    for (Map.Entry<Author, Integer> author : authorPriceMap.entrySet()) {
      System.out.println(author.getKey() + " - " + author.getValue());
    }
  }

  public void printCustomerBooks(String name) {
    List<Book> books = dataBase.getCustomerBooks(name);
    for (Book book : books) {
      System.out.println(book);
    }
  }

  public void printTenExpensiveBooks() {
    List<Book> books = dataBase.getTenExpensiveBooks();
    for (Book book : books) {
      System.out.println(book);
    }
  }

  public void printAuthors50YearsYounger() {
    List<Author> authors = dataBase.getAuthors50YearsYounger();
    for (Author author : authors) {
      System.out.println(author);
    }
  }

  public void printBooks() {
    List<Book> books = dataBase.getBooks();
    for (Book book : books) {
      System.out.println(book);
    }
  }

  private boolean isAuthorInBase(String authorName, String authorBirthday) {
    Map<Integer, Author> authors = dataBase.getAuthorsWithBirthday(authorName, authorBirthday);
    return !authors.isEmpty();
  }


  private Author selectAuthor() throws Exception {
    String authorName = MyScanner.getString("Enter author name:");
    if (authorName.equals("")) {
      return null;
    }
    Map<Integer, Author> authors = dataBase.getAuthors(authorName);
    if (authors.isEmpty()) {
      System.out.println("Author is not found");
      String str = MyScanner.getString("Do you want to add Author? (y, n):");
      if (str.equals("y")) {
        addAuthor(authorName);
        authors = dataBase.getAuthors(authorName);
      } else {
        throw new Exception("Author is not found");
      }
    }
    if (authors.size() == 1) {
      return (Author) authors.values().toArray()[0];
    }
    System.out.println("Authors");
    for (Author author : authors.values()) {
      System.out.println(author);
    }
    int authorId = MyScanner.getInt("Select Id: ");
    return authors.get(authorId);
  }

  private Customer selectCustomer() {
    String customerName = MyScanner.getString("Enter customer name:");
    Map<Integer, Customer> customers = dataBase.getCustomers(customerName);
    if (customers.isEmpty()) {
      createCustomer(customerName);
      customers = dataBase.getCustomers(customerName);
    }
    if (customers.size() == 1) {
      return (Customer) customers.values().toArray()[0];
    }
    System.out.println("Customers: ");
    for (Customer customer : customers.values()) {
      System.out.println(customer);
    }
    int customerId = MyScanner.getInt("Select Id: ");
    return customers.get(customerId);
  }

  private void createCustomer(String customerName) {
    String birthday = MyScanner.getString(
        "Enter customer's birthday 'YYYY-MM-DD' (press ENTER to skip): ");
    if (birthday.equals("")) {
      dataBase.insertCustomerWithoutBirthday(customerName);
      return;
    }
    dataBase.insertCustomer(customerName, birthday);
  }

  private Book selectBook() throws Exception {
    String bookName = MyScanner.getString("Enter book name: ");
    Map<Integer, Book> books = dataBase.getBooks(bookName);
    if (books.isEmpty()) {
      throw new Exception("No such book");
    }
    if (books.size() == 1) {
      return (Book) books.values().toArray()[0];
    }
    System.out.println("Books: ");
    for (Book book : books.values()) {
      System.out.println(book);
    }
    int bookId = MyScanner.getInt("Select id: ");
    return books.get(bookId);
  }
}