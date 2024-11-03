package ArrayProblemPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FIndKElementInList {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(frequencyMap.entrySet());

        // Step 2: Sort by frequency in descending order and take top k
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        System.out.println("List of map entries: " + entries);
        entries.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println("Sorted entries: " + entries);

        // Step 3: Extract the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        System.out.println("result " + Arrays.toString(result));

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 3, 3, 4, 4 };
        topKFrequent(nums, 4);
    }
}
