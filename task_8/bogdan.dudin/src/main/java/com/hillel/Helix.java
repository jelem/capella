package com.hillel;

public class Helix {

    public static int[][] build(int n) {
        if (n < 2)
            return null;

        int[][] array = new int[n][n];
        int k = 1;

        for(int i = 1; i <= n / 2; i++) {

            for (int j = i - 1; j < n - i + 1; j++)
                array[i - 1][j] = k++;

            for (int j = i; j < n - i + 1; j++)
                array[j][n - i] = k++;

            for (int j = n - i - 1; j >= i - 1; j--)
                array[n - i][j] = k++;

            for (int j = n - i - 1; j >= i; j--)
                array[j][i - 1] = k++;
        }

        if (n % 2 == 1)
            array[n / 2][n / 2] = n * n;

        return array;
    }
}
