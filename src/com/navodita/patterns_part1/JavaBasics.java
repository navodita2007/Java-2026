package com.navodita.patterns_part1;

public class JavaBasics {
    public static void main(String[] args) {
        //  for (int line = 1; line <= 10; line++) { // outer loop
        //  for (int line = 1; line <= 5; line++) { // outer loop
        //  for (int line = 1; line <= 6; line++) { // outer loop


        for (int line = 1; line <= 4; line++) { // outer loop

            // one line
            for (int star = 1; star <= line; star++) { // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
