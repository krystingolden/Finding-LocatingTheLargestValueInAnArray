package com.pluralsight;

public class Main {
    /*
    https://programmingbydoing.com/
    Locating the largest value in an array - Assignment #149
     */

    public static void main(String[] args) {

        //Create a new instance of numbers
        Numbers numbers = new Numbers();

        //Fill an array with random numbers
        numbers.getNumbers();

        //Locate the largest number in the array and display it
        numbers.locateLargest();

    }
}
