package com.dsa.programs;

import java.util.ArrayList;

public class Unique_combination
{
    public static ArrayList<String> Combos(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = Combos(p+ch,up.substring(1));
        ArrayList<String> right = Combos(p,up.substring(1));
        left.addAll(right);
        return left;

    }
    public static void explain()
    {
        System.out.println(Combos("", "abc"));
    }
}
