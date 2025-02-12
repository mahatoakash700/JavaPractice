package BasicProblems;

public class CheckArraySortedAndRotated {

    public static boolean checkArraySorted(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            /*
             * For each element nums[i], it compares it with the next element nums[(i + 1) %
             * n].
             * 
             * The modulo operation (i + 1) % n ensures that when i is the last index, the
             * next element wraps around to the first element (to handle the circular nature
             * of rotation).
             * 
             * Without Modulus:
             * 
             * If you don’t use modulus, the loop would stop at the last element (i = n-1),
             * and you wouldn’t compare the last element with the first element. This would
             * miss the critical violation in a rotated sorted array.
             * 
             * With Modulus:
             * 
             * The modulus ensures that the last element (nums[n-1]) is compared with the
             * first element (nums[0]), which is necessary to detect if the array is
             * rotated.
             */
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkArraySortedCodeOptimised(int[] nums) {

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n] && ++count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int[] arr1 = { 2,1,3,4};
        System.out.println(checkArraySorted(arr));
        System.out.println(checkArraySortedCodeOptimised(arr1));
    }

}
