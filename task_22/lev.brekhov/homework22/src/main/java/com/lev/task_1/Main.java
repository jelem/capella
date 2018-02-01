package com.lev.task_1;

public class Main {

  public static void main(String[] args) {
    File guests = new File();

    Apartment single = new Apartment(1, "Single");
    Apartment twin = new Apartment(2, "twin");
    Apartment triple = new Apartment(3, "Triple");
    Apartment deLuxe = new Apartment(4, "De luxe");
    Apartment business = new Apartment(5, "Business");

    Lodger jones = new Lodger("Peter", "Jones");
    Lodger white = new Lodger("Bob", "White");
    Lodger cooper = new Lodger("Frank", "Cooper");
    Lodger bold = new Lodger("James", "Bold");
    Lodger cook = new Lodger("Bob", "Cook");

    guests.put(jones, single);
    guests.put(white, triple);
    guests.put(cooper, twin);
    guests.put(bold, business);
    guests.put(cook, deLuxe);

    System.out.println(guests.get(bold));
  }

}
