package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    /*
     * 1.execution will happen from n-1, then n-2, then n-3......
     * 2. So total time taken-> n-1+n-2+n-3+...1 = n(n-1)/2 = n^2/2 - n/2 ~ n^2/2
     * ~O(n^2)
     * 
     */
    public static void bubbleSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();

        System.out.println("Enter array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("input array...");
        System.out.println(Arrays.toString(arr));

        for (int i = n  - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) { // i-1 is used so that j will run till 2nd last element and 2nd last
                                               // element will be compared with last element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println("Swapped array...");
        System.out.println(Arrays.toString(arr));
    }


    /*
     * Time Complexity
     * -------
     * ~O(n)
     * 
     */
    public static void bubbleSortOptimised() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();

        System.out.println("Enter array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("input array...");
        System.out.println(Arrays.toString(arr));

        for (int i = n - 1; i >= 1; i--) {
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
                System.out.println(Arrays.toString(arr));
            }
            if(!didSwap){
                break;
            }
            System.out.println("runs");
        }

        System.out.println("Swapped array...");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // bubbleSort();
        bubbleSortOptimised();
    }

}
