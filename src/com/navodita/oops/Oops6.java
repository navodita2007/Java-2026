package com.navodita.oops;
// Topic - Copy Constructor   ( Shallow-Copy Constructor )

/**
 * Copy constructor -: Copy constructor is used to copy all properties(all data i.e, variables like string, int etc.) of one object into another
 * object
 */
public class Oops6 {
    public static void main(String[] args) {
        Student6 s1 = new Student6();
        s1.name = "navodita";
        s1.roll = 222;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Suppose for some reason Student s1 forgets his password hence we need to create a new object s2
        Student6 s2 = new Student6(s1); //Copy
        // we want to copy all properties of s1 into s2, for this we create a constructor
        s2.password = "xyz";
        s1.marks[2] = 100;

        /* since we have copied all properties of s1 into s2 and trying to make a small change in s1 i.e,  s1.marks[2] = 100; ideally this change
         should not occur in s2, but it actually occurs, because this is shallow copy constructor.In shallow copy constructor, s1 & s2
         points to same variable marks. marks contains reference(address) of array object. marks doesn't contain the array itself, besides marks
         contain address of the array object created in memory.That is both s1 & s2 points to a single array object.*/


        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}


class Student6 {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow-Copy constructor
    Student6(Student6 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; // Here reference/address of array gets copied.Not entire array gets copied.
    }

    Student6() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    Student6(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student6(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}