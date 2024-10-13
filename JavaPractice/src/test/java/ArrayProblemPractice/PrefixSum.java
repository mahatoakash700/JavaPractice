package ArrayProblemPractice;

import java.util.Arrays;

public class PrefixSum {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void getPrefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        System.out.println("Prefix array");
        printArray(arr);
        System.out.println();
    }

    public static void getPrefixFor1BasedIndex(int[] arr, int startIndex, int lastIndex) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("New array: " + Arrays.toString(newArr));
        getPrefixSum(newArr);

        System.out.println("Sum of element from range: " + startIndex + " to " + lastIndex + " : "
                + (newArr[lastIndex] - newArr[startIndex - 1]));
    }

    public static void equalSumPartition(int[] arr) {
        // divide the array into 2 sub-arrays where both sub arrays having equal
        // sum

        int totalSum = 0, prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        System.out.println("Total sum of the array: " + totalSum);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                System.out.println("equal sum partition is possible: " + prefixSum + "," + suffixSum);
            } else {
                System.out.println("equal sum partition is not possible");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 5 };
        int[] arr1 = { 0, 2, 4, 1, 3, 6, 5 };
        int[] arr2 = { 1, 3, 1, 1, 2 };
        int[] arr3 = { 1, 1, 1, 1, 1, 1, 6 };
        // getPrefixSum(arr);
        // getPrefixSum(arr1);
        // getPrefixFor1BasedIndex(arr, 3, 5);
        // getPrefixFor1BasedIndex(arr1, 3, 5);
        equalSumPartition(arr2);
        equalSumPartition(arr3);
    }

}
