package com.navodita.patterns_part1;

public class JavaBasics1 {
    public static void main(String[] args) {
        int n = 4;  // n-> total no. of lines
        // int n = 5;
        // int n = 6;
        // int n = 7;
        // int n = 8;

        for (int line = 1; line <= n; line++) {
            //numbers print
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
