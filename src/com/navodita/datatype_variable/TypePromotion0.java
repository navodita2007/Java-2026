package com.navodita.datatype_variable;

public class TypePromotion0 {
    public static void main(String[] args) {
        short a= 5;
        byte b= 25;
        char c= 'c';
       // byte bt= a+b+c;
        /* java is giving error and suggesting to change variable bt type to int because
        java converts every datatype to int type. That is java does type promotion automatically. */
        byte bt = (byte) (a+b+c); // Type casting. Type casting has lossy conversion. Integer value calculated by java(i.e., type promotion) during addition i.e., a+b+c was converted to byte due to type casting.
        System.out.println(bt);

    }
}
