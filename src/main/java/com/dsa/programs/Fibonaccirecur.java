package com.dsa.programs;

public class Fibonaccirecur
{
   static int fib(int n )
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);

    }
    public static void execute()
    {
        System.out.println("10th number in fibonnaci is : " +fib(10));
    }
}
