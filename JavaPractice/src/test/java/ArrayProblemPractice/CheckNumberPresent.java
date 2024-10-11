package ArrayProblemPractice;

public class CheckNumberPresent {

    public static void checkNumberPresentInArray(int[] arr, int q) {
        int size = arr.length;

        int[] freq = new int[size + 5];// simply taking more size for better memory

        for (int i = 0; i < size; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }

        while (q > 0) {
            if (freq[q] > 0) {
                System.out.println("Number is present");
            } else {
                System.out.println("Not present");
            }
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 2, 6 };
        checkNumberPresentInArray(arr, 7);
    }

}
