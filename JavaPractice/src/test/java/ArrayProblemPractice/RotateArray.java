package ArrayProblemPractice;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr, int startIndex, int lastIndex) {
        System.out.print("starting from index: " + startIndex + " to lastIndex: " + lastIndex + " ");
        while (startIndex < lastIndex) {
            arr[startIndex] = arr[startIndex] + arr[lastIndex];
            arr[lastIndex] = arr[startIndex] - arr[lastIndex];
            arr[startIndex] = arr[startIndex] - arr[lastIndex];

            startIndex++;
            lastIndex--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));

    }

    public static void rotateArrayFromFirstByProvidingSteps(int[] arr) {
        int size = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te position from array is to be rotated");

        int pos = sc.nextInt();

        // New Array for storing rotated array
        int[] temp = new int[size];

        // Keeping track of current index of temp
        int k = 0;

        // for storing the rotated elements from pos to last index to new array
        for (int i = pos; i < size; i++) {
            temp[k++] = arr[i];
        }

        // for storing the rotated elements from pos to last index to new array
        for (int i = 0; i < pos; i++) {
            temp[k++] = arr[i];
        }

        System.out.println("rotated Array from 1st: " + Arrays.toString(temp));
        sc.close();

    }

    public static void rotateArrayFromLastByProvidingSteps(int[] arr) {
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te position from array is to be rotated");

        int pos = sc.nextInt();

        // New Array for storing rotated array
        int[] temp = new int[size];

        // Keeping track of current index of temp
        int k = 0;

        // Storing the size - pos elements of array arr[] to the front of temp[]
        for (int i = size - pos; i < size; i++) {
            temp[k++] = arr[i];
        }
        // Storing the first pos elements of arr[] into new array
        for (int i = 0; i < size - pos; i++) {
            temp[k++] = arr[i];
        }

        System.out.println("rotated Array from last: " + Arrays.toString(temp));
        sc.close();

    }

    public static void rotateFromFirstInPlace(int[] arr, int pos) {

        int size = arr.length;

        System.out.println("Input array: " + Arrays.toString(arr));

        reverseArray(arr, 0, pos - 1);
        reverseArray(arr, pos, size - 1);
        reverseArray(arr, 0, size - 1);

    }

    public static void rotateFromLastInPlace(int[] arr, int pos) {

        int size = arr.length;

        System.out.println("Input array: " + Arrays.toString(arr));

        reverseArray(arr, 0, size - pos - 1);
        reverseArray(arr, size - pos, size - 1);
        reverseArray(arr, 0, size - 1);

    }

    public static void transPoseMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Tranposed matrix");
        PrintArray.print2DArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;
            j--;
        }
        // System.out.println("Reversed matrix");
        // PrintArray.printArray(arr);
    }

    public static void rotateArrayPerpendicular(int[][] arr) {
        System.out.println("Input matrix");

        PrintArray.print2DArray(arr);
        transPoseMatrix(arr);

        for (int i = 0; i < arr[0].length; i++) {
            reverseArray(arr[i]);
        }

        System.out.println("Rotated Matrix");
        PrintArray.print2DArray(arr);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        int[][] arr3 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // rotateArrayFromFirstByProvidingSteps(arr);
        // rotateArrayFromLastByProvidingSteps(arr);

        // rotateFromFirstInPlace(arr1, 5);
        // rotateFromLastInPlace(arr2, 5);

        rotateArrayPerpendicular(arr3);
    }
}
