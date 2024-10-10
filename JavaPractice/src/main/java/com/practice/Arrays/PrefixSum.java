package com.practice.Arrays;

public class PrefixSum {

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

    public static void printPrefixArray(int[] arr) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            arr[i] += arr[i - 1];
        }

        print1DArray(arr);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        printPrefixArray(arr);
    }
}
