package com.hillel;

public class factorial {
    
    public static void main(String... args) {
        
        int n = Integer.parseInt(args[0]);
        int res = 1;
        
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        
        System.out.println("Result of " + n + "! is " + res);
        
    }
}