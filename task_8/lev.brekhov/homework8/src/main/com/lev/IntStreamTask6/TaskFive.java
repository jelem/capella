package com.lev.IntStreamTask6;

import java.util.Arrays;

public class TaskFive {

    public static void main(String[] args) {
        int[] arr = {2, 9, 10, 67, 88, 13};

        Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));
    }
}
