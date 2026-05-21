package com.navodita.functions_methods;
// Functions

import java.util.Scanner;

public class JavaBasics2 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);

    }

    public static void main(String args[]) {
        calculateSum();
    }
}
