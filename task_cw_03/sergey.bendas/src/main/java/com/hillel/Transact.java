package com.hillel;

import java.time.LocalDate;

public class Transact {

  private Account account;
  private int moneys;
  private LocalDate date;
  private ATM atm;

  public Transact(LocalDate date, Account account, int moneys, ATM atm) {
    this.date = date;
    this.account = account;
    this.moneys = moneys;
    this.atm = atm;
  }

  @Override
  public String toString() {
    return "Transact{"
        + "account=" + account.getId()
        + ", moneys=" + moneys
        + ", date=" + date
        + ", atm=" + atm
        + '}';
  }
}
