package com.hillel;

import java.util.Scanner;

public class Factorial {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите факториал: ");
        int n = scanner.nextInt();
        long fact = findFact(n);
        System.out.println("Результат: " + fact);

    }

    static long findFact(int len) {

        long res = 1;

        while(len > 0) {

            res *= len;
            len--;
        }
        return res;
    }
}
