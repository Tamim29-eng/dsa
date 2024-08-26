package com.dsa.programs;

import java.util.Arrays;

public class Letsee {
    public static void reverseString( char[] s, int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        else
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            reverseString(  s, start+1,  end-1);

        }


    }

    public static void run()
    {
        char [] s = {'a','b','c','d'};

        System.out.println("Original string" + Arrays.toString(s));
        reverseString(  s, 0,  s.length-1);
        System.out.println("Reversed string" + Arrays.toString(s));
    }

}