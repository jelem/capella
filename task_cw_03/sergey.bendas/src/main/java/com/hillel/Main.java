package com.hillel;

import com.hillel.Card.CardDate;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Bank bank = new Bank("Bank");
    Human wick = new Human("John Wick", 40);
    Human bond = new Human("James Bond", 37);

    Account account1 = new Account(1234, wick, 10000);
    Card card1 = new Card(account1, 1111, CardType.Visa, new CardDate(10, 20));
    Account account2 = new Account(1235, bond, 1000);
    Card card2 = new Card(account2, 1113, CardType.MasterCard, new CardDate(11, 21));

    Set<CardType> cardTypes = new HashSet<>();
    cardTypes.add(CardType.Visa);
    cardTypes.add(CardType.MasterCard);

    ATM atm = new ATM(bank, 10000, cardTypes);
    bank.addAccount(account1);
    bank.addAccount(account2);

    wick.insertCard(card1, atm);
    wick.selectService(atm);

    wick.selectService(atm);
    wick.backCard(atm);

    bond.insertCard(card2, atm);
    bond.selectService(atm);
    bond.backCard(atm);

    bank.getTransactions();
  }
}
