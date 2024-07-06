package com.dsa.programs;

public class EvenOdd {

    public static boolean isNumberEven(int number)
    {
        return number % 2 == 0;
    }

    public static void execute()
    {
        System.out.println("Number 347 is even: " + isNumberEven(347));
    }
}
