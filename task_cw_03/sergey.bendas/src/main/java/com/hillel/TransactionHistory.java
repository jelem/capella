package com.hillel;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {

  private List<Transact> transactList;

  public TransactionHistory() {
    this.transactList = new ArrayList<>();
  }

  public void add(Transact transact) {
    transactList.add(transact);
  }

  public void print() {
    for (Transact transact : transactList) {
      System.out.println(transact);
    }
  }
}
