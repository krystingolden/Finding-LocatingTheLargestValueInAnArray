package com.pluralsight;

import java.util.Random;

public class Numbers {

    //Create an array to store 10 integers
    private Integer[] numbers = new Integer[10];

    public void getNumbers() {
        //Initialize a random number generator
        Random r = new Random();

        //Fill the array with random numbers up to 100 and print them out
        System.out.print("Array: ");
        for (int index = 0; index < numbers.length; index++) {
            int number = r.nextInt(100);
            numbers[index] = number;
            System.out.print(number);
            System.out.print("  ");
        }
    }

    public void locateLargest() {
        int tempNum = 0;
        int tempIndex = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > tempNum) {
                tempNum = numbers[index];
                tempIndex = index;
            }
        }
        System.out.println();
        System.out.println("The largest number is " + tempNum + " and it is located in slot " + tempIndex);
    }
}
