package com.hillel;

public class LuckyTicket {

  public static void main(String[] args) {
    
    int start = 100_000;
    int end = 999_999;

    int count = countLuckyTickets(start, end);

    System.out.println("Number of lucky tickets: " + count);
  } 
 
  /*
  private static int countLuckyTickets(int start, int end) {
    int c = 0;
    for (int i = start; i <= end; i++) {
      int a6 = i % 10;
      int a5 = i / 10 % 10;
      int a4 = i / 100 % 10;
      int a3 = i / 1000 % 10;
      int a2 = i / 10000 % 10;
      int a1 = i / 100000 % 10;
      if ((a1 + a2 + a3) == (a4 + a5 + a6)) {
        c++;
      }
    }
    return c;
  }
  */
  
  private static int countLuckyTickets(int start, int end) {
    int counter = 0;
    for (int tickets = start; tickets <= end; tickets++) {
      if (isTicketsLucky(tickets)) {
        counter++;
      }
    }
    return counter;
  }

  private static boolean isTicketsLucky(int ticket) {
    int numbersLeft = ticket / 1000;
    int numbersRight = ticket % 1000;
    return sumOfDigits(numbersLeft) == sumOfDigits(numbersRight);
  }

  private static int sumOfDigits(int numbers) {
    int sum = 0;
    while (numbers > 0) {
      int rem = numbers % 10;
      sum+=rem;
      numbers/=10;
    }
    
    return sum;
  }

}