package com.dsa.programs;

public class ReducingToZero
{
    public static int numberOfSteps(int num, int s)
    {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (num == 0) {
            return s;
        }
        if (num % 2 == 0) {
            return numberOfSteps(num / 2, s + 1);
        } else {
            return numberOfSteps(num - 1, s + 1);
        }
    }

    public static void dollySingh(int num) {
        numberOfSteps(num, 0);
    }
}

