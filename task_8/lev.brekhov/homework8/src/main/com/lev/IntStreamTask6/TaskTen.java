package com.lev.IntStreamTask6;

import java.util.stream.IntStream;

public class TaskTen {

    public static void main(String[] args) {
        int[] arr = {5, 4, 0, 2, 4, -3, 6};
        int param = Integer.parseInt(args[0]);

        IntStream.range(0, arr.length)
                .filter(i -> arr[i] == param)
                .forEach(e -> System.out.println(e));
    }
}
