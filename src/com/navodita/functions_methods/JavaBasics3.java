package com.navodita.functions_methods;
// Functions

import java.util.Scanner;

public class JavaBasics3 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculateSum(int num1, int num2) {
        // parameters
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
