package ArrayProblemPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountPairsWithGivenSum {

    public static void countPairsForGivenSum(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<String> printedPairs = new HashSet<>();

        for (int num : arr) {

            int otherNum = sum - num;

            if (map.containsKey(otherNum)) {
                String pair = Math.min(num, otherNum) + "," + Math.max(num, otherNum);
                if (!printedPairs.contains(pair)) {
                    printedPairs.add(pair);
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Pairs found: " + printedPairs);
    }

    public static void countPairsForGivenTripleSum(int[] arr, int sum) {
        HashSet<String> printedPairs = new HashSet<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            int l = i + 1;
            int r = arr.length - 1;
            int x = arr[i];

            while (l < r) {
                if ((x + arr[l] + arr[r]) == sum) {
                    String triplet = Math.min(x, arr[l]) + "," + Math.min(arr[l], arr[r]) + ","
                            + Math.max(arr[l], arr[r]);
                    if (!printedPairs.contains(triplet)) {
                        printedPairs.add(triplet);
                    }
                    l++;
                    r--;
                } else if ((x + arr[l] + arr[r]) < sum) {
                    l++;
                } else {
                    r--;
                }
            }

        }

        System.out.println("Pairs found: " + printedPairs);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5, 11, 17, -3 };
        // countPairsForGivenSum(arr, 6);
        countPairsForGivenSum(arr, 12);
        // countPairsForGivenTripleSum(arr, 13);
    }

}
