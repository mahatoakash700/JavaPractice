package Sorting;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int arr[], int low, int high) {
        // code here
        if (low < high) { // Checks if there are at least two elements to sort.
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1); // Recursively sorts the left subarray.
            quickSort(arr, pIndex + 1, high); // Recursively sorts the right subarray.
        }

        System.out.println("sorted Array..");
        System.out.println(Arrays.toString(arr));
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            /*
             * i <= high - 1
             * This ensures that the left pointer does not go beyond the second-to-last
             * element (high - 1). This is because the pivot is chosen as arr[high], and we
             * don't want the left pointer to compare the pivot with itself.
             */

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            /*
             * right >= low + 1
             * This ensures that the right pointer does not go below the second element (low
             * + 1). This is because the pivot is at arr[high], and we don't want the right
             * pointer to compare the pivot with itself or go out of bounds.
             */

            /*
             * What Happens if We Use left <= high and right >= low?
             * 
             * If you change the conditions to left <= high and right >= low:
             * 
             * The left pointer could potentially compare the pivot (arr[high]) with itself,
             * which is redundant and unnecessary.
             * 
             * The right pointer could also compare the pivot with itself or go out of
             * bounds, leading to incorrect behavior.
             * 
             * This could result in unnecessary swaps or incorrect partitioning, which would
             * break the QuickSort algorithm.
             */

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;

        /*
         * Q- why are we swappiung arr[high] with arr[left], why not arr[right]?
         * 
         * After the while loop, the left pointer points to the first element that is
         * greater than the pivot.(while while(i<j) it keeps on sorting smaller elements
         * before pivot, so after the while loop, left of pivot is sorted to smalled
         * values only)
         * 
         * Swapping arr[high] with arr[left] places the pivot in its correct sorted
         * position in the array.
         * 
         * The right pointer points to an element that is less than or equal to the
         * pivot (because the right pointer moves leftward until it finds an element
         * smaller than the pivot).
         * 
         * Swapping arr[high] with arr[right] would place the pivot in a position where
         * elements to its left might still be greater than the pivot, breaking the
         * partitioning logic.
         */

    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSort(arr, 0, arr.length - 1);
    }

}
