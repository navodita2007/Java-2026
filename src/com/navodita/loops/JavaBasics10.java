package com.navodita.loops;

import java.util.Scanner;

// keep entering numbers till user enters a multiple of 10
public class JavaBasics10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true); // infinite-loop
    }
}

// it is a never-ending loop (infinite-loop) because we wrote 'true' statement in while-loop
