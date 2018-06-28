package com.hillel.task1;

public class Main {

  public static void main(String[] args) {

    Guest guest1 = new Guest("John", "Wayne", 34);
    Guest guest2 = new Guest("Trevor", "Goldshmidt", 25);
    Guest guest3 = new Guest("Alice", "Liddel", 48);
    Guest guest4 = new Guest("Bessy", "Tune", 59);

    Appartments app1 = new Appartments(203, 500, "good");
    Appartments app2 = new Appartments(305, 800, "bad");
    Appartments app3 = new Appartments(1001, 300, "not bad");
    Appartments app4 = new Appartments(1408, 1600, "godlike");


    CustomHashMap map = new CustomHashMap();
    map.put(guest1, app1);
    map.put(guest2, app2);
    map.put(guest3, app3);
    map.put(guest4, app4);

    map.dataBase(guest3);
  }

}
