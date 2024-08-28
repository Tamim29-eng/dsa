package com.dsa.programs;

public class NaturalSum
{

    public static int sum(int n)
{
    if (n <= 1)
    {
        return n;
    }
    return n + sum(n-1);

}
    public static void doooo()
    {

        System.out.println(sum(6));
    }




}
