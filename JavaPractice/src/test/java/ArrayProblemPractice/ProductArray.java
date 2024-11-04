package ArrayProblemPractice;

import java.util.Arrays;

public class ProductArray {

    public static void productArrayElementDiscludingSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        System.out.println("result: " + Arrays.toString(result));

    }

    public static void main(String[] args) {
        productArrayElementDiscludingSelf(new int[] { 1, 2, 4, 6 });
        productArrayElementDiscludingSelf(new int[] { -1, 0, 1, 2, 3 });
    }

}
