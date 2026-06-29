package com.navodita.oops;

// CONSTRUCTOR_OVERLOADING
public class Oops4 {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        Student4 s2 = new Student4("navodita");
        Student4 s3 = new Student4(122);
        // Student4 s4 = new Student4("deepak", 293);


        System.out.println(s1.name);
    }
}

class Student4 {
    String name;
    int roll;

    Student4() { // non-parametrized constructor
        //this.name = name;
        System.out.println("constructor is called...");
    }

    Student4(String name) {
        this.name = name;
    }

    Student4(int roll) {
        this.roll = roll;
    }
}
/*  In constructor overloading( multiple constructors ) the default_constructor
 is not created, if we don't create a constructor( non-parametrized or parametrized ) for a
 particular object.

*/

/*  When we create multiple objects and based on the object created the suitable constructor gets
 called automatically, this is known as constructor overloading.It is also an example of Polymorphism.
 Polymorphism means multiple forms.

*/

