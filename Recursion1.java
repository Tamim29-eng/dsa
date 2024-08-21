package com.dsa.programs;

 public class Recursion1
 {

        static int Max_Min(int arr[] , int n)
        {
            if(n==1)
            {
                return arr[0];
            }
            return Math.min(arr[n-1], Max_Min(arr , n-1));
        }

       public static void executioner()
        {
            int arr[] = {1,2,3,4,5,0};
            int n = arr.length;
            System.out.println( Max_Min(arr , n));
        }


}

