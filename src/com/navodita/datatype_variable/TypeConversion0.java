package com.navodita.datatype_variable;

import java.util.*;
public class TypeConversion0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();  // implicit/widening/type conversion (in java).
        System.out.println(number);

       // int number = sc.nextFloat();  // error : because data from float can't be assigned into int.float is bigger than int.
       // System.out.println(number);



    }
}
