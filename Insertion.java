package com.dsa.programs;

import java.util.Arrays;

public class Insertion
{
    static void recurseInsert(int arr[], int n)
    {
        if (n<=1)
        {
            return;
        }
        recurseInsert( arr,  n-1);
        int last = arr[n-1];
        int j = n-2;

        while(j>=0 && arr[j]>last)
        {
             arr[j+1] = arr[j];
             j--;

        }
        arr[j+1] = last;



    }

    public static void go()
    {
        int arr[] = {20,1,33,12,9};
        System.out.println("The unsorted array is :" + Arrays.toString(arr));
        recurseInsert( arr, arr.length);
        System.out.println("The sorted array is :" + Arrays.toString(arr));
    }

}
