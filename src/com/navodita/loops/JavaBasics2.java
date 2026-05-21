package com.navodita.loops;
import java.util.Scanner;

// Print numbers from 1 to n
public class JavaBasics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1; // initialised value 1 to counter because will print numbers starting from 1.

        while(counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
