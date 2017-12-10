package com.lev;

public class SpiralNumbers {

    public static void main(String[] args) {

        int num = 10;
        int[][] spiral = new int[num][num];
        int view = 0;
        int i = 0;
        int j = 0;
        int step = num;
        int end = num * num;
        for (int k = 1; k <= end ; k++) {
            spiral[i][j] = k;
            step--;
            if (step == 0) {
                if (view % 2 == 0) {
                    num--;
                }
                step = num;
                view++;
            }
            switch (view%4) {
                case 0:
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    j--;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
        for (i = 0; i < spiral.length; i++) {
            for (j = 0; j < spiral[i].length; j++) {
                System.out.print(spiral[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }
}
