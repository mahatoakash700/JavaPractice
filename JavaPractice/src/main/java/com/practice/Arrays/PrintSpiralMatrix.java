package com.practice.Arrays;

public class PrintSpiralMatrix {

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

    public static void printSpiralMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int topRow = 0, bottomRow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElements = 0;

        while (totalElements < (row * col)) {// using while - loop to print spiral till total elements present
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < (row * col); j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < (row * col); i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < (row * col); j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < (row * col); i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }};

        printSpiralMatrix(arr1);
        // print2DArray(arr);
    }

}
