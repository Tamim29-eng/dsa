package com.dsa.programs;

public class RemoveDuplicates
{
    public static void Removechar (String p, String up)
    {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.length()>1 && up.charAt(0) == up.charAt(1))
        {
            Removechar ( p,  up.substring(1));
        }
        else
        {
            Removechar (p+ch, up.substring(1));
        }

    }
    public static void impliment()
    {
        Removechar ("", "aabbaa");
    }
}
