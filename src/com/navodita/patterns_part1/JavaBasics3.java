package com.navodita.patterns_part1;

public class JavaBasics3 {
    public static void main(String[] args) {
        int n = 4;
        // int n = 5;
        // int n = 6;
        // int n = 7;

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
