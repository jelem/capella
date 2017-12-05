package com.lev;

public class TriangleOfPascal {

    public static void main(String... args) {
        int num = 14;
        int[][] pascal;
        pascal = new int[num][];

        pascal[0] = new int[1];
        pascal[1] = new int[2];
        pascal[1][0] = pascal[1][1] = 1;
        System.out.println(pascal[0][0] = 1);
        System.out.println(pascal[1][0] + " " + pascal[1][1]);
        for (int i = 2; i < num; i++) {
            pascal[i] = new int[i + 1];
            System.out.print((pascal[i][0] = 1) + " ");
            for (int j = 1; j < i; j++) {
                System.out.print((pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]) + " ");
            }
            System.out.println(pascal[i][i] = 1);
        }
    }
}