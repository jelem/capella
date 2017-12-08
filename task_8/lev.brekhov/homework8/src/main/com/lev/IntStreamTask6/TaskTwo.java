package com.lev.IntStreamTask6;

import java.util.stream.IntStream;

public class TaskTwo {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];

        IntStream.range(0, arr.length)
                .forEach(e -> System.out.println(e));
    }
}