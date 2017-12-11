package com.hillel;

public class PascaleTriangle {

    public static int[][] triangleBuild(int str) {    //str - кол-во строк
        int[][] tri = new int[str][];

        for (int i = 0; i < str; i++) {
            tri[i] = new int[i + 1];
            tri[i][0] = 1;
            tri[i][i] = 1;
            for (int j = 1; j < i; j++) {
                tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
            }
        }
        return tri;
    }
}
