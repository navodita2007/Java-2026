package com.navodita.arrays_part1;
// Pairs in an array

public class Arrays7 {
    public static void printPairs(int numbers[]) {
        int tp = 0; // tp : total pairs
        for (int i = 0; i < numbers.length; i++) {
            int currnt = numbers[i]; // 2, 4, 6, 8, 10  (prints current value)
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + currnt + "," + numbers[j] + ") ");  // prints pairs
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
        // To find total number of pairs is a v.imp question for interview.
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
