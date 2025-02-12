package ArrayProblems;

import java.util.Arrays;
import java.util.HashSet;

public class FindSingleNumber {

    public static int singleNumber(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        if ((nums.length) == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
    }

    public static int singleNumberUsingHashing(int[] arr) {
        HashSet<Integer> sn = new HashSet<>();
  // This scneaio will work only there is exactly 2 same numbers and only one single number
        for (int num : arr) {
            if (sn.contains(num)) {
                sn.remove(num);
            } else {
                sn.add(num);
            }
        }
        return sn.iterator().next();
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,3};
        System.out.println("Single Number: " + singleNumber(arr));
        System.out.println("Single NumberUSing hash: " + singleNumberUsingHashing(arr));
    }

}
