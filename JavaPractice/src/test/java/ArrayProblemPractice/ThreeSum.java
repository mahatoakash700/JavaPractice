package ArrayProblemPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total < target) {
                    j++;
                } else if (total > target) {
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSumFullyOptimised(int[] nums, int target) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[i] - nums[j];
                if (seen.contains(complement)) {
                    // Form the triplet and sort it to avoid duplicates
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    uniqueTriplets.add(triplet); // Automatically avoids duplicate triplets
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> res = threeSum(nums, 3);
        // In above 3sum method, if the target is three, then only [0,1,2] will be
        // printed.
        // but this approach will be less optimised that above one
        System.out.println("Result: " + res);

        List<List<Integer>> res1 = threeSumFullyOptimised(nums, 3);
        System.out.println("Result: " + res1);

        //did not get any solution which will print [2,-1,-4] and other possible values

    }

}
