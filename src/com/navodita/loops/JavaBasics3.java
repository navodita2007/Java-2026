package com.navodita.loops;
// print sum of first n natural numbers

import java.util.Scanner;

public class JavaBasics3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i; // sum=sum+i ;
            i++;
        }
        System.out.println("sum is : "+sum);
    }
}
