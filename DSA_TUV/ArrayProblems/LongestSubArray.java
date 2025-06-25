package ArrayProblems;

import java.util.HashMap;

public class LongestSubArray {

    public int longestSubarrayBruteForce(int[] arr, int num) { // O(N^3)

        int n = arr.length;
        int length = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == num) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        return length;
    }

    public int longestSubarrayOptimal(int[] arr, int num) { // O(N^2)

        int n = arr.length;
        int length = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == num) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        return length;
    }

    public static int longestSubarrayWithSumK(int[] a, int n, int k) {

        // int[] a = {1, 2, 3, 1, 1, 1, 1};

        int size = a.length;
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer, Integer> presumMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (presumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - presumMap.get(sum - k));
            }
            presumMap.putIfAbsent(sum, i);

        }

        return maxLen;
    }

    /*
     * q - why (sum -k) is checked in map and then maxLen is calculated if it is
     * true
     * Let’s take the array [1, 2, 3, 1, 1, 1, 1] and k = 3:
     * 
     * At i = 5, sum = 9 (cumulative sum up to index 5).
     * 
     * We check if (sum - k) = 6 exists in the map. It does, and it was first seen
     * at index 2.
     * 
     * This means the subarray from index 3 to 5 has a sum of k = 3:
     * 
     * sum[5] - sum[2] = 9 - 6 = 3
     * 
     * The length of this subarray is 5 - 2 = 3.
     */

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 1, 1, 1 };
        int n = a.length;
        int k = 3;

        int result = longestSubarrayWithSumK(a, n, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + result);
    }

}
