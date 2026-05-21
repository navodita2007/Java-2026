package com.navodita.functions_methods;

public class IsPrime {

    public static boolean isPrime(int n) {
        // Corner cases
        // 2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { //true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(20); // 2 to 20
        primesInRange(100); // 2 to 100

    }
}