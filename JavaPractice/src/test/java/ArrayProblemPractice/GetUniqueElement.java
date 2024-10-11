package ArrayProblemPractice;

import java.util.*;

public class GetUniqueElement {

    public static void getUniqueElementUsingBruteForce(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i <= arr.length; i += 2) {
            if (arr[i] != arr[i + 1]) {
                System.out.println("unique element: " + arr[i]);
                return;
            }
        }
    }

    public static void getUniqueElementUsingXOR(int[] arr) {

        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            System.out.println("XOR of " + res + " and " + arr[i] + " is: ");
            res = res ^ arr[i];
            System.out.println(res);
        }
        System.out.println("unique element: " + res);
        // XOR does binary operation
        // https://www.geeksforgeeks.org/bitwise-operators-in-java/
        // Example:
        // a = 5 = 0101 (In Binary)
        // b = 7 = 0111 (In Binary)

        // Bitwise XOR Operation of 5 and 7
        // 0101
        // ^ 0111
        // ________
        // 0010 = 2 (In decimal)
    }

    public static void getALlUniqueElements(int[] arr) {
        HashMap<Integer, Integer> frequencyElements = new HashMap<>();
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            frequencyElements.put(arr[i], frequencyElements.getOrDefault(arr[i], 0) + 1);

        }

        System.out.println(frequencyElements);

        for (Map.Entry entry : frequencyElements.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
            if ((Integer) entry.getValue() == 1) {
                uniqueElements.add((Integer) entry.getKey());
            }
        }

        System.out.println("uniqueElements: " + uniqueElements);
    }

    public static void getAllUniqueElementsUsingBinarySearch(int[] arr) {

    }

    public static void main(String[] args) {
        int ar[] = { 3, 5, 4, 19, 5, 3, 4 };
        // int ar[] = { 3, 3, 4, 4, 5, 5, 19 };
        int ar1[] = { 3, 5, 4, 19, 5, 3, 4, 23 };
        getUniqueElementUsingBruteForce(ar);
        // getUniqueElementUsingXOR(ar);
        // getALlUniqueElements(ar1);

    }

}
