package ArrayProblemPractice;

import java.lang.Math;

public class SortArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapElement(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void sortArrayByEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapElement(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
        printArray(arr);
    }

    public static void sortSquares(int[] arr) {
        int left = 0, right = arr.length - 1;

        int[] newArr = new int[arr.length];
        int k = 0;

        while (left < right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                newArr[k++] = arr[left] * arr[left];
                left++;
            } else {
                newArr[k++] = arr[right] * arr[right];
                right--;
            }
        }

        printArray(newArr);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 6, 8, 1, 64 };
        int[] arr1 = { -3, 1, 2, 3, 4, 5, 6, };
        // sortArrayByEvenOdd(arr);
        sortSquares(arr1);
    }

}
