package com.hillel;

public class Main{

    public static void main(String[] args){

        int start = 100_000;
        int finish = 999_999;

        int count = countLuckyTickets(start, finish);

        System.out.println("Quantity of Lucky Tickets: " + count);

    }

    private static int countLuckyTickets (int start, int finish)
    {
        int counter = 0;
        for(int ticket = start; ticket <= finish; ticket++){

            if(isTicketLucky(ticket)){
                counter++;
            }

        }

        return counter;
    }

    private static boolean isTicketLucky(int ticket) {

      int numleft = ticket / 1000;
      int numright = ticket % 1000;

      return sumOfDigits(numleft) == sumOfDigits(numright);

}

private static int sumOfDigits(int numbers){

        int sum = 0;
        while(numbers > 0){

            int rem = numbers % 10;
            sum += rem;
            numbers = numbers / 10;

        }
        return sum;
    }
}