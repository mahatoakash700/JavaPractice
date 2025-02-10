package ArrayProblems;

import java.util.Arrays;

public class SecondSmallestElement {

    public static void getSecondSmallestByBrute(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        if (n < 2) {
            System.out.println("Unable to find 2nd smallest as total array size itself is 1");
            return;

        }

        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] != smallest) {
                sSmallest = arr[i];
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("2nd smallest doest not exist");
        } else {
            System.out.println("2nd smallest by brute: " + sSmallest);
        }
    }

    public static void getSecondSmallestByOptimal(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Unable to find 2nd smallest as total array size itself is 1");
            return;
        }

        int smallest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        int sSmallest = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
                found = true;
            }
        }
        if (!found) {
            System.out.println("2nd smallest doest not exist");
        } else {
            System.out.println("2nd smallest by optimal: " + sSmallest);
        }
    }

    public static void getSecondSmallestOptimised(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Unable to find 2nd smallest as total array size itself is 1");
            return;

        }

        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        boolean found = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
                found = true;
            } else if (arr[i] < sSmallest && arr[i] > smallest) {
                sSmallest = arr[i];
                found = true;
            }
        }
        if (!found) {
            System.out.println("2nd smallest doest not exist");
        } else {
            System.out.println("2nd smallest by optimised: " + sSmallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };
        getSecondSmallestByBrute(arr);
        getSecondSmallestByOptimal(arr);
        getSecondSmallestOptimised(arr);
    }
}
