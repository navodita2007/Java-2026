package com.navodita.oops;
// Topic -> Deep-Copy Constructor

public class Oops7 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "navodita";
        s1.roll = 222;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Suppose for some reason Student s1 forgets his password hence we need to create a new object s2
        Students s2 = new Students(s1); //Copy
        // we want to copy all properties of s1 into s2, for this we create a constructor
        s2.password = "xyz";
        s1.marks[2] = 100;

        /* since we have copied all properties of s1 into s2 and trying to make a small change in s1 i.e,  s1.marks[2] = 100; ideally this change
         should not occur in s2 */

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}


class Students {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow-Copy constructor
//    Students(Students s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks; // Here reference/address of array gets copied.Not entire array gets copied.
//    }

    // Deep-copy constructor
    Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Students() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    Students(String name) {
        marks = new int[3];
        this.name = name;
    }

    Students(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
