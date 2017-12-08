package com.lev.IntStreamTask6;

import java.util.stream.IntStream;

public class TaskOne {

    public static void main(String... args) {
            int[] elem = new int[10];

            IntStream.rangeClosed(1, elem.length / 2)
                    .forEach(e -> System.out.println(e));
    }
}