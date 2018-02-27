package com.hillel;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {

  private int id;
  private Human owner;
  private int moneys;

  public Account(int id, Human owner, int moneys) {
    this.id = id;
    this.owner = owner;
    this.moneys = moneys;
  }

  public Human getOwner() {
    return owner;
  }

  public int getMoneys() {
    return moneys;
  }

  public int getId() {
    return id;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Account account = (Account) object;
    return id == account.id;
  }

  @Override
  public int hashCode() {

    return Objects.hash(id);
  }


  public void withdrawMoneys(int moneys) {
    if (moneys > this.moneys) {
      throw new RuntimeException("No moneys in balance");
    }
    this.moneys -= moneys;
  }

  public void putMoneys(int moneys) {
    this.moneys -= moneys;
  }


}
