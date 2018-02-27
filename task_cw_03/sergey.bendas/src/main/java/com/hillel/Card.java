package com.hillel;

public class Card {

  private Account account;
  private boolean block;
  private int pinCode;
  private CardType cardType;
  private CardDate cardDate;

  public Card(Account account, int pinCode, CardType cardType, CardDate cardDate) {
    if (pinCode < 1000 || pinCode > 9999) {
      throw new RuntimeException("Wrong pin code");
    }
    this.account = account;
    this.pinCode = pinCode;
    this.cardType = cardType;
    this.block = false;
    this.cardDate = cardDate;
  }

  public Account getAccount() {
    return account;
  }

  public boolean isBlock() {
    return block;
  }

  public int getPinCode() {
    return pinCode;
  }

  public CardType getCardType() {
    return cardType;
  }

  public CardDate getCardDate() {
    return cardDate;
  }

  public static class CardDate {

    private int month;
    private int year;

    public CardDate(int month, int year) {
      if (month > 12 || month < 1 || year < 0 || year > 99) {
        throw new RuntimeException("Wrong date");
      }
      this.month = month;
      this.year = year;
    }

    public int getMonth() {
      return month;
    }

    public int getYear() {
      return year;
    }

  }
}
