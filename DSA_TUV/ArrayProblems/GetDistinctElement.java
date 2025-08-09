package ArrayProblemPractice;

import java.util.*;

public class GetDistinctElement {

    public static void getDistinctElementWithoutCollection(int[] arr) {
        int size = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            while (i < size - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            System.out.print(arr[i] + " , ");
        }
    }

    public static void getDistinctElementUsingCollection(int[] arr) {
        HashSet<Integer> distinctElements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!distinctElements.contains(arr[i])) {
                distinctElements.add(arr[i]);
            }
        }

        System.out.println("distinct elements: " + distinctElements);
    }

    public static void main(String[] args) {
        int ar[] = { 3, 5, 4, 19, 5, 3, 4, };
        getDistinctElementWithoutCollection(ar);
        getDistinctElementUsingCollection(ar);
    }

}
