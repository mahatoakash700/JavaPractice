package ArrayProblemPractice;

public class SortZerosAndOnes {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapElement(int[] arr, int left, int right) {
        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
    }

    public static void sortZeroesAndOnesInArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapElement(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        sortZeroesAndOnesInArray(arr);

    }

}
