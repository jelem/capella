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
    return "Ticket{" + "price=" + price
        + ", carriage=" + carriage
        + ", seat=" + seat
        + ", date=" + date
        + ", city='" + city + '\''
        + '}';
  }

  public static Ticket inData() {
    Scanner scanner = new Scanner(System.in,"utf-8");
    int carriage = 1;
    double price = 100.0;

    int seat = Ticket.seatInput(scanner.nextInt());
    System.out.println("Enter date and city where you want to go");
    LocalDate date = Ticket.dateInput(scanner.next());
    String city = Ticket.cityInput(scanner.next());
    System.out.println("Enter a seat");

    return new Ticket(price, carriage, seat, date, city);
  }

  private static int seatInput(int input) throws IndexOutOfBoundsException{
    if (input > seats.length) {
      throw new IndexOutOfBoundsException("Maximum value of seats is 36");
    }

    if (input < 1) {
      throw new IndexOutOfBoundsException("Seats belong 1 don't exist");
    }
    return seats[input - 1];
  }

  private static LocalDate dateInput(String userInput) throws RuntimeException{
    System.out.print("Date format M/d/yyyy: ");

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    return LocalDate.parse(userInput, dateFormat);
  }

  private static String cityInput(String userInput) {
    System.out.println("You can choose from Odessa, Lvov, Kiev");

    boolean correctCity = false;
    while (!correctCity) {
      System.out.println("City: ");
      correctCity = !userInput.equals("Lvov") && !userInput.equals("Odessa") && !userInput.equals("Kiev");
    }
    return userInput;
  }

  public static void buyTicket () {
    Ticket ticket = Ticket.inData();
    System.out.println("Your ticket: " + ticket);
//    addTicket(ticket);
  }

//  private void addTicket(Ticket ticket) {
//  }
}
