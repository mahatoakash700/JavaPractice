package ArrayProblems;

public class LargestElement {

    public static void getLargestElement(int[] arr) {
        int n = arr.length;

        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
               largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 4, 100};
        getLargestElement(arr);
    }

}
