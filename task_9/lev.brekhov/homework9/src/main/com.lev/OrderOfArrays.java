package com.lev;

public class OrderOfArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};

        int[] both = new int[a.length + b.length];
        System.arraycopy(a, 0, both, 0, a.length);
        System.arraycopy(b, 0, both, a.length, b.length);

        int[] bothSorted = sort(both);
        for(int i = 0; i < bothSorted.length; i++) {
            System.out.print(i +", ");
        }
    }

    public static int[] sort(int[] both) {
        for (int i = 0; i < both.length; i++) {
            int small = i;
            for (int j = i + 1; j < both.length; j++)
                if (both[j] < both[small])
                    small = j;
            int smaller = both[small];
            both[small] = both[i];
            both[i] = smaller;
        }
        return both;
    }
}
