package com.navodita.oops;

// PARAMETRIZED CONSTRUCTOR
public class Oops2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("navodita");
        System.out.println(s1.name); // object.reference_variable
    }

}

class Student2 {
    String name;
    int roll;

    // Parametrized constructor
    Student2(String name) {  // value from String name(parameter) will be added to String name(reference_variable)
        this.name = name;
        // instance variable = constructor parameter
        // System.out.println("constructor is called ...");
    }
}
