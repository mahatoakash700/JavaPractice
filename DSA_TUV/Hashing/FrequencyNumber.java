package Hashing;

import java.util.ArrayList;
import java.util.List;

public class FrequencyNumber {

    public static List<Integer> frequencyCountInt(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        int freqArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] <= n) { // checking here arr[i] < n as freqArray size is max arr.length, if we
                                              // put 13 in arr, then freqArray size needs to exceed to 13, else
                                              // freqArray[arr[i]}] will throw error.
                                              // freqArray[13]- size not available

                freqArray[arr[i] - 1]++; // here -1 we are doing because in question, req array is 1-based indexing
            }
        }

        List<Integer> newList = new ArrayList<>();
        for (int freq : freqArray) {
            newList.add(freq); // Autoboxing occurs here
        }

        return newList;

    }

    public static int frequencyCountSmallChar(String input, char input2) {
        int freqArray[] = new int[26];

        for (int i = 0; i < input.length(); i++) {
            freqArray[input.charAt(i) - 'a']++; // 'a' is subtracted because small character starts from 97, so to get
                                                // exact ascii number of small characters, it is done
        }

        return freqArray[input2 - 'a']; // same reason as above
    }

    public static int frequencyCountAllChar(String input, char input2) {
        int freqArray[] = new int[256];

        for (int i = 0; i < input.length(); i++) {
            freqArray[input.charAt(i)]++;
        }

        return freqArray[input2];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        String s = "aAghbhcah";
        // List<Integer> frequencies = frequencyCountInt(arr);
        // int frequencies = frequencyCountSmallChar(s,'b');
        int frequencies = frequencyCountAllChar(s, 'A');

        System.out.println("Frequencies: " + frequencies);
    }

}
