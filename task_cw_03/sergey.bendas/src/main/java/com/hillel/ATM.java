package com.hillel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ATM {

  private Bank bank;
  private int moneys;
  private Stack<Card> cards;
  private Card currentCard;
  private Set<CardType> supportedCardTypes;

  public ATM(Bank bank, int moneys, Set<CardType> cardTypes) {
    this.bank = bank;
    this.moneys = moneys;
    this.supportedCardTypes = new HashSet<>(cardTypes);
    this.cards = new Stack<>();
  }

  public void insertCard(Human human, Card card) {
    if (this.currentCard != null) {
      cards.push(this.currentCard);
    }
    this.currentCard = card;
    try {
      checkCard();
      checkPin(human);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void checkPin(Human human) throws Exception {
    for (int i = 0; i < 3; i++) {
      Screen.print("Enter pin-code");
      int password = human.enterPinCode();
      if (password == currentCard.getPinCode()) {
        return;
      }
      Screen.print("Pin code is not correct");
    }
    cards.push(currentCard);
    currentCard = null;
    throw new Exception("Incorrect pin");
  }

  private void checkCard() throws Exception {
    if (!isSupportCardType()) {
      Screen.print("This card is not supported");
      throw new Exception("Not supported card");
    }
    if (currentCard.isBlock()) {
      cards.push(currentCard);
      currentCard = null;
      Screen.print("This card is blocked");
      throw new Exception("Card is blocked");
    }
    if (currentCard.getCardDate().getMonth() < LocalDate.now().getMonthValue()
        || currentCard.getCardDate().getYear() < LocalDate.now().getYear() - 2000) {
      Screen.print("Card expired");
      throw new Exception("Card expired");
    }

  }

  private boolean isSupportCardType() {
    CardType currentCardType = currentCard.getCardType();
    return supportedCardTypes.contains(currentCardType);
  }

  public void viewBalance() {
    if (currentCard == null) {
      Screen.print("Insert card");
      return;
    }
    Screen.printBalance(currentCard.getAccount().getMoneys());
  }

  public void withdrawMoney(Human human) {
    if (currentCard == null) {
      Screen.print("Insert card");
      return;
    }
    Screen.print("Enter sum you want to take:");
    int moneys = human.enterMoneys();
    if (!this.hasEnoughMoney(moneys)) {
      Screen.print("ATM has no enough money");
      return;
    }
    if (moneys > currentCard.getAccount().getMoneys()) {
      Screen.print("There is not enough money in your balance");
      return;
    }
    currentCard.getAccount().withdrawMoneys(moneys);
    Transact transact = new Transact(LocalDate.now(), currentCard.getAccount(),
        moneys * -1, this);
    bank.addTransact(transact);
  }

  private boolean hasEnoughMoney(int moneys) {
    return this.moneys >= moneys;
  }

  public void moneyTransfer(Human human) {
    if (currentCard == null) {
      Screen.print("Insert card");
      return;
    }
    Screen.print("Enter Account for transfer");
    int accNum = human.enterAccountForTransfer();
    Account accountFrom = currentCard.getAccount();

    if (!bank.isAccountExist(accNum)) {
      Screen.print("Account is not found");
      return;
    }
    Account accountTo = bank.getAccount(accNum);
    if (accountFrom.equals(accountTo)) {
      Screen.print("Wrong account");
      return;
    }

    Screen.print("Enter moneys");
    int moneys = human.enterMoneys();
    LocalDate localDate = LocalDate.now();
    accountFrom.withdrawMoneys(moneys);
    accountTo.putMoneys(moneys);
    Transact transact1 = new Transact(localDate, accountFrom, moneys * -1, this);
    Transact transact2 = new Transact(localDate, accountTo, moneys, this);
    bank.addTransact(transact1);
    bank.addTransact(transact2);
    Screen.print("Successfully");


  }

  public void printServices() {
    Screen.printServices();
  }

  public void backCard() {
    currentCard = null;
  }
}
