package ArrayProblemPractice;

public class CountOccurances {

    public static void countNoOfOccurances(int[] arr, int input) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                count++;
            }
        }
        System.out.println("total occurances for input: " + input + " is: " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54,3,2,2};
        countNoOfOccurances(arr, 2);
        countNoOfOccurances(arr, 3);

    }

}
