package com.lev.IntStreamTask6;

import java.util.Arrays;

public class TaskFour {

    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 23};

        Arrays.stream(arr)
                .filter(i -> i % 3 == 0)
                .forEach(i -> System.out.println(i));
    }
}
