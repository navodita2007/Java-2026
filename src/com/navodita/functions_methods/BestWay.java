package com.navodita.functions_methods;
// Functions
// This is a proper way of writing the code for functions.

import java.util.Scanner;

public class BestWay {

    // Function definition
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // Function definition
    public static int calculateSum(int num1, int num2) { // Parameters or Formal parameters
        // parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // Arguments or Actual parameters
        System.out.println("sum is : " + sum);

    }
}
