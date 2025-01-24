package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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

    public static void frequencyCountIntMap() {
        Map<Integer, Integer> mapList = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            mapList.put(arr[i], mapList.getOrDefault(arr[i], 0) + 1);
        }

        mapList.forEach((key, value) -> System.out.println(key + "-" + value));

        int high = 0;
        for(Map.Entry<Integer, Integer> entry : mapList.entrySet()){
            if(entry.getValue() > high){
                high = entry.getValue();
            }
        }
        System.out.println("Highest frequency: " + high);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        String s = "aAghbhcah";
        // List<Integer> frequencies = frequencyCountInt(arr);
        // int frequencies = frequencyCountSmallChar(s,'b');
        // int frequencies = frequencyCountAllChar(s, 'A');
        // System.out.println("Frequencies: " + frequencies);

        frequencyCountIntMap();
    }

}
