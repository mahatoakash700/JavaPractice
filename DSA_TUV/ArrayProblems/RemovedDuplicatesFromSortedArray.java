package ArrayProblems;

import java.util.Arrays;

public class RemovedDuplicatesFromSortedArray {

    // Leetcode q-26
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int i = 1;
        for (int j = 1; j < n; j++) {
            if (nums[i - 1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(nums));
        return i;
    }

    /*
     * comparing nums[i-1] with nums[j] as previous value to be compared with next
     * value. example 0th position value to be compared with 1st, 2nd ,3rd values
     * came from nums[j]. then if they are unequal, we will place it in nums[i]
     * place not nums[i-1] place as we need unique values next to nums[i-1].
     */

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("Total unique elements: " + removeDuplicates(arr));
    }

}
