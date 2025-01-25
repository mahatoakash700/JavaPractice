package Sorting;

import java.util.Arrays;

public class SelectionSort {

    /*
     * In selection sort, first element is assumed to be the smallest, and then
     * through iteration keep checking for the smallest and swapping it in the
     * entire array
     */

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        System.out.println("input array...");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) { 
                if (arr[j] < arr[min]) {
                    arr[j] = arr[j] + arr[min];
                    arr[min] = arr[j] - arr[min];
                    arr[j] = arr[j] - arr[min];
                }
                // System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("Swapped array...");
        System.out.println(Arrays.toString(arr));
        // Arrays.stream(arr).forEach(k -> System.out.print(k + ","));
    }

    /*
     * Time complexity
     * ----
     * 1.execution will happen from n-1, then n-2, then n-3......
     * 2. So total time taken-> n-1+n-2+n-3+...1 = n(n-1)/2 = n^2/2 - n/2 ~ n^2/2
     * ~O(n^2)
     * 
     * 
     */

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSort(arr);
    }

}
