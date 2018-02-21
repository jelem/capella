package com.hillel;

import java.util.HashMap;
import java.util.Map;

public class Bank {

  private String name;
  private Map<Integer, Account> accountMap;
  private TransactionHistory transactionHistory;

  public Bank(String name) {
    this.name = name;
    accountMap = new HashMap<>();
    transactionHistory = new TransactionHistory();
  }


  public void addAccount(Account account) {
    accountMap.put(account.getId(), account);
  }

  public boolean isAccountExist(int accNum) {
    return accountMap.containsKey(accNum);
  }

  public Account getAccount(int accNum) {
    if (!isAccountExist(accNum)) {
      throw new RuntimeException("Account is not exists");
    }
    return accountMap.get(accNum);
  }

  public TransactionHistory getTransactionHistory() {
    return transactionHistory;
  }

  public void getTransactions() {
    transactionHistory.print();

  }

  public void addTransact(Transact transact) {
    transactionHistory.add(transact);
  }
}
