package com.lev;

public class TaskTwo {

    public static int factorial(int num) {
        int fact[] = new int[num];
        int result = 1;
        for (int i = 1; i <= fact.length; i++) {
            result = result * i;
        }
        return result;
    }
}
