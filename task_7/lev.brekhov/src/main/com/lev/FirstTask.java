package com.lev;

public class FirstTask {

    public static int function(int num) {
        int result = 0;

        while (num >= 10) {
            int i = num % 10;
            num = (num - i) / 10;
            result = result + i;
        }
        return result;
    }
}