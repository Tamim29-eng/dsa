package com.dsa.programs;

import java.util.Scanner;

public class MatrixXMatrix {

   public static int matrix() {

        int row1, col1, row2, col2;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix: ");
        row1 = s.nextInt();

        System.out.print("Enter number of columns in first matrix: ");
        col1 = s.nextInt();

        System.out.print("Enter number of rows in second matrix: ");
        row2 = s.nextInt();

        System.out.print("Enter number of columns in second matrix: ");
        col2 = s.nextInt();

        int nums[][] = new int[row1][col1];
        int nums2[][] = new int[row2][col2];
        int nums3[][] = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            nums[i] = new int[col1];
        }

        for (int i = 0; i < row2; i++) {
            nums[i] = new int[col2];
        }

        for (int i = 0; i < row1; i++) {
            nums3[i] = new int[col2];

        }

        if (col1 != row2) {
            return 0;
        }
        System.out.println("Enter values for first matrix : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) nums[i][j] = s.nextInt();
        }
        System.out.println("\nEnter values for second matrix : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) nums2[i][j] = s.nextInt();
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                nums3[i][j] = 0;

                for (int z = 0; z < col1; z++) {
                    nums3[i][j] += nums[i][z] * nums2[z][j];
                }
                System.out.println("Matrix multiplication is :" + nums3[i][j] +" ");
            }
            System.out.println( );
        }
         return 1;
    }
}