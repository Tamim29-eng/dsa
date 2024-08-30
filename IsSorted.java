package com.dsa.programs;

public class IsSorted
{
    public static boolean IsArraySorted(int arr[], int n)
    {
        if(n==1 || n ==0)
        {
            return true;
        } else if (arr[n-1] >= arr[n-2])
        {
            return IsArraySorted( arr, n-1);

        }
        return false;
    }

    public static void result()
    {
        int arr[] = {0,4,5,8};
        if(IsArraySorted(arr, arr.length))
        {
            System.out.println("Yes");

        }
        else {
            System.out.println("No");
        }
    }
}
