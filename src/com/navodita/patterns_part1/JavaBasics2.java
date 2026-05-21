package com.navodita.patterns_part1;

public class JavaBasics2 {
    public static void main(String[] args) {
        int n = 4;
        // int n = 5;
        // int n = 10;
        // int n = 20;
        char ch = 'A';

        // Outer loop
        for (int line = 1; line <= n; line++) {
            // Inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
