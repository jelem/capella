package ua.pp.darknsoft;

import ua.pp.darknsoft.exception.SeatIsBusyCheckedException;

/**
 * Created by Andrew on 03.02.2018.
 */
public class Main {

  public static void main(String[] args) {
    RailwayCarriage[] train = new RailwayCarriage[10];
    for (int i = 0; i < train.length; i++) {
      train[i] = new RailwayCarriage();
    }
    //###################################TRY TO SELL TICKET (Checked) ##############################
    try {
      train[1].setPersonChecked(1, new Person("Alex", "Drowber", 12));
      train[1].setPersonChecked(1, new Person("John", "Wayne", 45));
    } catch (SeatIsBusyCheckedException ex) {
      ex.printStackTrace();
    }
    //###################################TRY TO SELL TICKET (UnChecked) ############################
    train[1].setPersonUnChecked(1, new Person("Alex", "Drowber", 12));
  }

}
