package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int mid = (left + right) / 2;

        System.out.println("================");
        System.out.println("left: " + low);
        System.out.println("mid: " + mid);
        System.out.println("right: " + high); 

        if (low >= high) {
            return;
        }
        mergeSort(arr, left, mid);
        System.out.println("arr mid+1");
        mergeSort(arr, mid + 1, right); 
        // the moment right value will be 0, thet moment left and mid will be 0,
        // then as low will be become equal, it will return back right =0 value
        // will never be passed to array there by right = 0 will never happen. it
        // will take riugh = 1 its previous value only
        mergeArray(arr, left, mid, right);
    }

    public static void mergeArray(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= right && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        System.out.println(temp);

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        int n = arr.length - 1;
        // System.out.println("Sorted array...");
        // System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, n);
    }

}
