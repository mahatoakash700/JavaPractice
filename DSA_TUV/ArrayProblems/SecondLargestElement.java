package ArrayProblems;

import java.util.Arrays;

public class SecondLargestElement {

    public static void getSecondLargestElementBySorting(int[] arr) { // O(nlogn)
        int n = arr.length;

        Arrays.sort(arr);
        int secondLargest = -1; // for one testcase , requirement is: if every element is same, then return
                                // output as -1
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("2nd largest by brute: " + secondLargest);
    }

    public static void getSecondLargestElementOptimal(int[] arr) { // O(N+N)->O(2N)
        int n = arr.length;

        int largest = arr[0];
        int sLargest = -1;
        // find largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // find 2nd largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > sLargest && arr[i] < largest) {
                sLargest = arr[i];
            }
        }

        System.out.println("2nd largest by optimal: " + sLargest);

    }

    public static void getSecondLargestElementOptimised(int[] arr) {// O(n)
        int n = arr.length;

        int largest = arr[0];
        int sLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }

        System.out.println("2nd largest by optimised: " + sLargest);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        getSecondLargestElementOptimal(arr);
        getSecondLargestElementBySorting(arr);
    }
}
