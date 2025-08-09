package ArrayProblemPractice;

public class ReverseArray {

    public static void reverseArrayUsingTwoPointers(int[] arr) {
        int size = arr.length;
        int left = 0, right = size - 1;

        while (left < right) {
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];

            left++;
            right--;
        }

        System.out.println("Reversed Array");
        PrintArray.printArray(arr);
    }

    public static void reverseArrayWithoutUsingTwoPointers(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size / 2; i++) {
            arr[i] = arr[i] + arr[size - i - 1];
            arr[size - i - 1] = arr[i] - arr[size - i - 1];
            arr[i] = arr[i] - arr[size - i - 1];
        }

        System.out.println("Reversed Array");
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 13, 4, 6, 8, 9 };
        int[] arr1 = { 1, 2, 13, 4, 6, 8, 9 };
        reverseArrayUsingTwoPointers(arr);
        reverseArrayWithoutUsingTwoPointers(arr1);

    }

}
