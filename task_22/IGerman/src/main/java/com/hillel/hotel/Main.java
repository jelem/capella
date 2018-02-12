package com.hillel.hotel;

public class Main {

  public static void main(String[] args) {

    Visitor wayne = new Visitor("John", "Wayne", 34);
    Visitor twain = new Visitor("Mark", "Twain", 25);
    Visitor smith = new Visitor("Jessy", "Smith", 28);

    Visitor white = new Visitor("Bob", "White", 34);

    Apartments one = new Apartments("Standart", 100.00, 1);
    Apartments two = new Apartments("Luxe", 200.00, 2);
    Apartments three = new Apartments("DoubleLuxe", 300.00, 3);
    Apartments four = new Apartments("Standart", 100.00, 1);

    CustomHashMap map = new CustomHashMap();
    map.put(wayne, one);
    map.put(twain, two);
    map.put(smith, three);
    map.put(white, four);

    map.getInformation(white);
    map.getInformation(smith);
  }
}
