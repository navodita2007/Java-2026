package com.navodita.oops;

// NON-PARAMETRIZED CONSTRUCTOR
public class Oops3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        // System.out.println(s1.name);
    }
}

class Student3 {
    // String name;
    // int roll;

    Student3() { // non-parametrized constructor
        //this.name = name;
        System.out.println("constructor is called...");
    }
}
