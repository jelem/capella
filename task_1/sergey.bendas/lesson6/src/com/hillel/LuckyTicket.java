package com.hillel;

public class LuckyTicket {

    public static void main(String[] args) {

        int start = 000_000;
        int end = 999_999;

        int count = countLuckyTickets(start, end);

        System.out.println("Количество счастливых билетов: " + count);
    }

    private static int countLuckyTickets(int start, int end) {

        int counter = 0;

        for(int ticket = start; ticket <= end; ticket++) {

            if (isTicketLucky(ticket)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isTicketLucky(int ticket) {

        int numbersLeft = ticket / 1000;
        int numbersRight = ticket % 1000;

        return sumOfDigits(numbersLeft) == sumOfDigits(numbersRight);

    }

    private static int sumOfDigits(int numbers) {

        int res = 0;
        while(numbers > 0) {

            int rem = numbers % 10;
            res += rem;
            numbers = numbers / 10;
        }
        return res;
    }
}