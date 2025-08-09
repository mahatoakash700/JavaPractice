package ArrayProblemPractice;

import org.testng.annotations.Test;

public class SearchInArray {

    public static void serachInArray(int[] arr, int searchInput) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchInput) {
                System.out.println("input is present in array");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 8, 9 };
        int searchInput = 3;
        serachInArray(arr, searchInput);
    }
}
