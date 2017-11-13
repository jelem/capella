package com.java;

public class Array {

    public static void main(String[] args) {

    }

    public void fiveFromTenArray_1(int[] ar) {    //1 вариант
        for (int i = 0; i < 5; i++) {
            System.out.println(ar[i]);
        }
    }

    public void fiveFromTenArray_2(int a, int b) {    //2 вариант (a = 5, b = 10)

        int[] ar = new int[b];
        for (int i = 0; i < b; i++) {
            ar[i] = i;
        }
        for (int i = 0; i < a; i++) {
            System.out.println(ar[i]);
        }
    }

    public int[] nElementsArray_1(int n) {
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = i;
        }
        return ar;
    }


    public int[] nElementsArray_2(int n) {
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = n - i;
        }
        return ar;
    }


    public void divisionBy3Array(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 3 == 0) {
                System.out.println(ar[i]);
            }
        }
    }


    public void evenElementArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.println(ar[i]);
            }
        }
    }


    public int sumOfElementsArray(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }


    public int averageOfArray(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        int average = sum / ar.length;
        return average;
    }


    public int maxMinSumArray(int[] ar) {
        int min = ar[0];
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return min + max;
    }


    public int multiplicationArray(int[] ar) {
        int mult = 1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                mult *= ar[i];
            }
        }
        return mult;
    }

    public void positionOfNArray(int[] ar, int n) {

        int a = 0;
        boolean isExist = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n) {
                a = i;
                isExist = true;
            }
        }
        if (isExist) {
            System.out.println(a);
        } else {
            System.out.println("No such number in this array");
        }
    }

    public void positionOfNArray_2(int[] ar, int n) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n) {
                System.out.println(i);
            } else {
                System.out.println("No such number in this array");
            }
        }
    }

    public void positionOfNArray_3(int[] ar, int n) {

        for (int i = 0; i < ar.length; i++) {

            if (isExist(ar[i], n)) {
                System.out.println(i);
            } else {
                System.out.println("No such number in this array");
            }
        }
    }

    boolean isExist(int c, int b) {
        return (c == b);
    }

}
