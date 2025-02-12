package ArrayProblems;

import java.util.Arrays;

public class FindMissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int tTotal = n * (n + 1) / 2;
        int sum = Arrays.stream(nums).sum();

        // for (int i = 0; i < n; i++) {
        // sum += nums[i];
        // }

        return tTotal - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Missing number: " + missingNumber(arr));
    }

}
