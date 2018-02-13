package ua.pp.darknsoft.input;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;

import java.math.BigDecimal;
import java.util.Scanner;

public class Console {

  public Author readAuthor() {
    Scanner in = new Scanner(System.in, "UTF-8");
    System.out.println("Enter author firstName: ");
    String firstName = in.next();
    System.out.println("Enter author lastName: ");
    String lastName = in.next();
    System.out.println("Enter author age: ");
    int age = in.nextInt();
    return new Author(firstName, lastName, age);
  }

  public Consumer readConsumer() {
    Scanner in = new Scanner(System.in, "UTF-8");
    System.out.println("Enter author firstName: ");
    String firstName = in.next();
    System.out.println("Enter author lastName: ");
    String lastName = in.next();
    System.out.println("Enter author age: ");
    int age = in.nextInt();
    return new Consumer(firstName, lastName, age);
  }

  public Book readBook() {
    Scanner in = new Scanner(System.in, "UTF-8");
    System.out.println("Enter a book name: ");
    String name = in.nextLine();
    System.out.println("Enter the author ID (int): ");
    int authorId = in.nextInt();
    System.out.println("Enter some a price: (_ _ _ _,_ _)");
    BigDecimal price = in.nextBigDecimal();
    return new Book(name, authorId, price);
  }
}
