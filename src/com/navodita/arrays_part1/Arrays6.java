package com.navodita.arrays_part1;

public class Arrays6 {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int inputArray[] = {2, 4, 6, 8, 10};

        reverse(inputArray);

        //print the reversed array
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
