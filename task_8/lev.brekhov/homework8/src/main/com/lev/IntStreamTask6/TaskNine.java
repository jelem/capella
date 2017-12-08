package com.lev.IntStreamTask6;

import java.util.Arrays;

public class TaskNine {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, -1, -4, 7};

        int mult = Arrays.stream(arr)
                .filter(e -> e % 2 != 0)
                .reduce(1, (x, y) -> x * y);
        System.out.println(mult);
    }
}