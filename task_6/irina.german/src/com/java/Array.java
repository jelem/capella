package com.java;

public class Array {

    public static void main(String[] args) {

    }

    public void array1_1 (int[] ar){    //1 вариант
        for (int i = 0 ; i< 5; i++ ){
            System.out.println(ar[i]);
        }
    }

    public void array1_2 (int a, int b){    //2 вариант (a = 5, b = 10)

        int[] ar = new int[b];
        for (int i = 0 ; i< b; i++ ) {
            ar[i] = i;
        }
        for (int i = 0 ; i< a; i++ ){
            System.out.println(ar[i]);
        }
    }

    public int[] array2 (int n){
        int[] ar = new int[n];

        for (int i = 0 ; i< n; i++ ){
            ar[i] = i;
        }
        return ar;
    }


    public int[] array3 (int n){
        int[] ar = new int[n];
        for (int i = 0 ; i< n; i++ ){
            ar[i] = n - i;
        }
        return ar;
    }


    public void array4 (int[] ar){
         for (int i = 0 ; i< ar.length; i++ ){
            if (ar[i] % 3 == 0) {
                System.out.println(ar[i]);
            }
        }
    }


    public void array5 (int[] ar){
        for (int i = 0 ; i< ar.length; i++ ){
            if (ar[i] % 2 == 0) {
                System.out.println(ar[i]);
            }
        }
    }


    public int array6 (int[] ar){
        int sum = 0;
        for (int i = 0 ; i< ar.length; i++ ){
            sum += ar[i];
        }
        return sum;
    }


    public int array7 (int[] ar){
        int sum = 0;
        for (int i = 0 ; i< ar.length; i++ ){
            sum += ar[i];
        }
        int average = sum/ar.length;
        return average;
    }


    public int array8 (int[] ar) {
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


    public int array9 (int[] ar) {
        int mult = 1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                mult *= ar[i];
            }
        }
        return mult;
    }

    public void array10 (int[] ar, int n) {

        int a = 0;
        boolean isExist = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n) {
                a = i;
                isExist = true;
            }
        }
        if (isExist == true) {
            System.out.println(a);
        } else {
            System.out.println("No such number in this array");
        }
    }

}
