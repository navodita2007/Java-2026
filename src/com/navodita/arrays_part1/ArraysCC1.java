package com.navodita.arrays_part1;

public class ArraysCC1 {
    public static void update(int marks[], int nonChangeable) {

        // The function update has updated the marks through call by reference.
        // If arrays were not call by reference then updation would not work.

        nonChangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;

        update(marks, nonChangeable);
        
        System.out.println(nonChangeable); // pass by value.

        // In pass by value, the changed value doesn't reflect any changes in main function.

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

        /* Arrays work through call by reference but any other variable works through call by value.
        Hence, values of the array got updated but value of the variable did not change. */