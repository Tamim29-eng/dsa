package com.dsa.programs;


public class Sumdigits
{
    public static int AddDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return (n%10) + AddDigits(n/10);


    }
    public static void finall()
    {

        System.out.println(AddDigits(1522));
    }
}