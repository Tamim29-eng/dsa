package com.dsa.programs;

public class Geekonacci
{
     static int strangeseries(int A, int B, int C, int n)
    {
        if(n == 1)
        {
            return A;
        }
        if(n == 3)
        {
            return B;
        }
        if(n == 2)
        {
            return C;
        }

        return strangeseries(A,  B,  C,  n-1)+strangeseries( A,  B,  C, n-2)+strangeseries( A,  B,  C,  n-3);



    }
    public static void Doingit()
    {
        int result = strangeseries( 1,  3,  2,  6);
        System.out.println("The result for the given integer is :" + result);
    }
}
