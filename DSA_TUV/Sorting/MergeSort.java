package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int mid = (left + right) / 2;

        if (low >= high) {
            return;
        }
        System.out.println("================");
        System.out.println("left: " + low);
        System.out.println("mid: " + mid);
        System.out.println("right: " + high);

        mergeSort(arr, left, mid);

        mergeSort(arr, mid + 1, right);

        // the moment right value will be 0, that moment left and mid will also be 0,
        // then as low will be become equal, it will return back as low >= high = same
        // right =0 value will never be passed to array there by right = 0 will never
        // happen. it will take right = 1, its previous value only

        mergeArray(arr, left, mid, right);
    }

    public static void mergeArray(int[] arr, int low, int mid, int high) {
        System.out.println("");
        System.out.println("==Merging==");
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        System.out.println("left: " + left);
        System.out.println("mid: " + mid);
        System.out.println("right: " + right);
        System.out.println("high: " + high);

        System.out.println("Arry:" + Arrays.toString(arr));

        while (left <= mid && right <= high) {
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
        System.out.println("temp: " + temp);

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low); 
            // if -low is removed, the arrayOutOfBounds as temp might not have values store
            // till i
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        // int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        int n = arr.length - 1;
        // System.out.println("Sorted array...");
        // System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, n);
    }

}
