package ArrayProblemPractice;

public class CheckForSortedArray {

    public static boolean checkForSortedArray(int[] arr) {
        boolean isArraySorted = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                isArraySorted = true;
            }
        }
        return isArraySorted;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 2, 3, 4, 1 };
        System.out.println("is Array Sorted: " + checkForSortedArray(arr));
        System.out.println("is Array Sorted: " + checkForSortedArray(arr1));

    }

}
