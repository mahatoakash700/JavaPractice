package ArrayProblems;

import java.util.Arrays;

public class RotateArray {

    //https://leetcode.com/problems/rotate-array/

    public static void rotateArray(int[] nums, int k) {
        System.out.println("Input Array: " + Arrays.toString(nums));
        int n = nums.length;
        k = k % n; // capturing the remainder

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }

    /*
     * suppose k=9 and n=7, then rotation will be same as k=2
     * as k%n = 9%7 = remainder - 2
     * 
     * k=2,n=7 -> 2%7 = 2
     */

    /*
     * reverse(0, last index) → whole array
     * reverse(0, k - 1) → before k
     * reverse(k, last index) → after k
     */

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(arr, 9);
    }

}
