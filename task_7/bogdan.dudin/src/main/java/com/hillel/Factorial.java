package com.hillel;

public class Factorial {

    public static int intNumber(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
