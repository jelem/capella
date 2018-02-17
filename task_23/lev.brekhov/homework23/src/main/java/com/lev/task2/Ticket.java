package com.lev.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ticket {

  private double price;
  private int carriage;
  private static final int[] seats = new int[36];
  private int seat;
  private LocalDate date;
  private String city;

  public Ticket(double price, int carriage,int seat, LocalDate date, String city) {
    this.price = price;
    this.carriage = carriage;
    this.seat = seat;
    this.date = date;
    this.city = city;
  }

  @Override
  public String toString() {
    return "Your Ticket: " + "price = " + price
        + ", carriage = " + carriage
        + ", seat = " + seat
        + ", date = " + date
        + ", city = '" + city + '\''
        + '.';
  }

  public static Ticket inData() {
    Scanner scanner = new Scanner(System.in,"utf-8");
    int carriage = 1;
    double price = 100.0;

    System.out.println("Enter a seat");
    int seat = Ticket.seatInput(scanner.nextInt());
    System.out.println("Enter date and city where you want to go");
    System.out.print("Date format m/d/yyyy: ");
    LocalDate date = Ticket.dateInput(scanner.next());
    System.out.println("You can choose from Odessa, Lvov, Kiev");
    String city = Ticket.cityInput(scanner);

    return new Ticket(price, carriage, seat, date, city);
  }

  private static int seatInput(int input) throws IndexOutOfBoundsException{
    if (input > seats.length) {
      throw new IndexOutOfBoundsException("Maximum value of seats is 36");
    }

    if (input < 1) {
      throw new IndexOutOfBoundsException("Seats belong 1 don't exist");
    }

    return input;
  }

  private static LocalDate dateInput(String userInput) throws RuntimeException {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    return LocalDate.parse(userInput, dateFormat);
  }

  private static String cityInput(Scanner scanner) {
    String input;
    while (true) {
      System.out.println("City: ");
      input = scanner.next();
      if (input.equals("Lvov") || input.equals("Odessa") || input.equals("Kiev")) {
        return input;
      }
    }
  }

  public static void buyTicket () {
    System.out.println(Ticket.inData());
  }
}
