package com.navodita.functions_methods;
// Check if a number is prime or not.

//public class Prime {                                  // first-way
//    public static boolean isPrime(int n) {
//        boolean isPrime = true;  // I have supposed the number as prime at first.
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {   // Completely dividing
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime; // isPrime is a variable.
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPrime(5));
//    }
//}

public class Prime {                              // fourth-way. This is best way.
    // only for n>=2
    public static boolean isPrime(int n) {
        // Corner cases
        // 2
        if (n == 2) {
            return true;
        }
//        boolean isPrime = true;  // I have supposed the number as prime at first.
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {   // Completely dividing
//                isPrime = false;                            // third-way
//                return isPrime;
                return false;
            }
        }
        // return isPrime; // isPrime is a variable.
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}


//public class Prime {                             // second-way
//    public static boolean isPrime(int n) {
//        boolean isPrime = true;  // I have supposed the number as prime at first.
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {   // Completely dividing
//                isPrime = false;
//                return isPrime;
//                //   return false;
//            }
//        }
//        return isPrime; // isPrime is a variable.
//        // return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPrime(5));
//    }
//}

