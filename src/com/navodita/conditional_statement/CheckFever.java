package com.navodita.conditional_statement;

import java.util.Scanner;

public class CheckFever {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp>100){
            System.out.println("you have fever");
        } else {
            System.out.println("you don't have fever");
        }
    }
}
