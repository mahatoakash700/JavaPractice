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

    public static int[] topKElementOptimised(int[] nums, int k) {
        System.out.println("starting optimised solution...");
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("frequency: " + freqMap);

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        System.out.println("bucket values: " + Arrays.toString(bucket));

        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            // starting from last, as suppose for input array of 6 elements, last index will
            // be
            // 5, in this index whatever number will be there that will be most frequent,
            // that
            // means in an array of 6 elements, there is a number which is present 5 times,
            // so
            // most frequent number.

            if (bucket[pos] != null) {
                for (int value : bucket[pos]) {
                    result.add(value);
                    counter++;
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] topKElementOptimisedWithNonRepetetiveElements(int[] nums, int k) {
        System.out.println("starting optimised solutionn without repetetive elements...");
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("frequency: " + freqMap);

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        System.out.println("bucket values: " + Arrays.toString(bucket));

        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int pos = bucket.length - 1; pos >= 0; pos--) {
            if (bucket[pos] != null) {
                for (int value : bucket[pos]) {
                    if (counter < k) {
                        result.add(value);
                        counter++;
                    }
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 3, 3, 4, 4, 6, 6 };
        topKFrequent(nums, 2);
        int[] result = topKElementOptimised(nums, 2);
        System.out.println("Result: " + Arrays.toString(result));
        int[] result1 = topKElementOptimisedWithNonRepetetiveElements(nums, 2);
        System.out.println("Result: " + Arrays.toString(result1));
    }
}
