package com.dsa.programs;

import java.util.Arrays;

public class Bubblesort
{
    static void recurseBubble(int arr[], int start, int end)
    {
        if (start == end)
        {
            return;
        }
        if(start < end)
        {
            if(arr[start] > arr[start+1])
            {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;

            }
            recurseBubble(arr, start+1, end);



        }
        recurseBubble( arr, start, end-1);

    }

    public static void exec()
    {
        int arr[] = {20,1,33,12,9};
        System.out.println("The unsorted array is :" + Arrays.toString(arr));
        recurseBubble( arr, 0, arr.length-1);
        System.out.println("The sorted array is :" + Arrays.toString(arr));
    }
}
