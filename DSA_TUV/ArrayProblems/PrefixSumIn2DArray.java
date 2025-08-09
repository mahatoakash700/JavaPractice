package com.practice.Arrays;

import java.util.Scanner;

public class PrefixSumIn2DArray {

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printSumByBruteForceMethod(int[][] arr, int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("sum by bruteForceMethod: " + sum);
    }

    public static void printPrefixSumRowWiseIn2DArray(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

    }

    public static void printPrefixSumColWiseIn2DArray(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }

    }

    public static void printSumByOptimization(int[][] arr, int row1, int col1, int row2, int col2) {
        int sum = 0;

        printPrefixSumRowWiseIn2DArray(arr);

        for (int i = row1; i <= row2; i++) {
            if (col1 > 0) {
                sum += arr[i][col2] - arr[i][col1 - 1];
            } else {
                sum += arr[i][col2];
            }
        }

        System.out.println("sum by optimized code: " + sum);
    }

    public static void printSumByBestOptimizedApproach(int[][] arr, int row1, int col1, int row2, int col2) {
        // college wallah - lecture 23, problem solving in 2D array -3,timsstamp-34:30

        int result = 0, sum = 0, up = 0, left = 0, leftUp = 0;

        printPrefixSumRowWiseIn2DArray(arr);
        printPrefixSumColWiseIn2DArray(arr);

        sum = arr[row2][col2];
        if (row1 >= 1) {
            up = arr[row1 - 1][col2];
        }
        if(col1 >= 1){
            left = arr[row2][col1 - 1];
        }

        if(row1 >= 1 && col1 >= 1){
            leftUp = arr[row1 - 1][col1 - 1];
        }
        result = sum - up - left + leftUp;

        System.out.println("sum by best optimized technique: " + result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns in matrix");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boudaries r1,r2,c1,c2");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        printSumByBruteForceMethod(arr, r1, c1, r2, c2);
        print2DArray(arr);

        // printSumByOptimization(arr, r1, c1, r2, c2);
        // print2DArray(arr);

        printSumByBestOptimizedApproach(arr, r1, c1, r2, c2);

    }

}
