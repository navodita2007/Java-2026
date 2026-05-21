package com.navodita.datatype_variable;

import java.util.*;

// sum of a & b -> input from user
// product of a & b -> input from user

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*      int sum = a + b;
            System.out.println(sum);
        */
        int product = a * b;
        System.out.println(product);
    }
}
