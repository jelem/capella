package com.hillel;

public class Cycles {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }

        int number = 1;
        for (int i = 0; i <= 54; i++) {
            System.out.println(number);
            number += 2;
        }

        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }

        number = 2;
        for (int i = 0; i <= 19; i++) {
            System.out.println(number);
            number *= 2;
        }
    }
}
