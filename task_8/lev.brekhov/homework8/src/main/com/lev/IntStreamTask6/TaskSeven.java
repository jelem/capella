package com.lev.IntStreamTask6;

import java.util.Arrays;

public class TaskSeven {

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10, 16};

        int sum = Arrays.stream(arr).sum();
        System.out.println("Medium is: " + (sum / arr.length));
    }
}