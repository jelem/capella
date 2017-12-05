package com.lev.IntStreamTask6;

import java.util.Arrays;

public class TaskEight {

    public static void main(String[] args) {
        int[] arr = {4, -7, 1, 0, 7};
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("Sum of max and min numbers is: " + (max + min));
    }
}