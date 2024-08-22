package com.dsa.programs;

public class RecursionBS
{
    static int BinarySearch(int arr[], int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }


            int m = s + (e - s) / 2;
            if (arr[m] == target)
            {
                return m;
            }
            else if (arr[m] > target)
            {
                return BinarySearch(arr, target, s, m - 1);

            }
            else
            {
                return BinarySearch(arr, target, m + 1, e);

            }


    }
    public static void execute()
    {
        int arr[] = {11,22,33,44,65};
        int ans = BinarySearch( arr, 65 , 0, arr.length-1);
        System.out.println(ans);
    }

}
