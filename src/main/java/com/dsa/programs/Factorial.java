package com.dsa.programs;

public class Factorial {

    public static long factorial(int n)
    {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void execute()
    {
        long factorial = factorial(20);
        System.out.println("Factorial of 20 is: " + factorial);
    }
}
