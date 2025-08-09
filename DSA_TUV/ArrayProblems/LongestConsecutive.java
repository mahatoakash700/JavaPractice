package ArrayProblemPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        int longestSeq = 0;

        for (int num : nums) {
            numMap.put(num, Boolean.FALSE);
        }
        System.out.println("map data: " + numMap);

        for (int num : nums) {
            int currLength = 1;
            numMap.put(num, Boolean.TRUE);

            // check in forward direction
            int nextNum = num + 1;
            while (numMap.containsKey(nextNum) && !numMap.get(nextNum)) {
                currLength++;
                numMap.put(nextNum, Boolean.TRUE);
                nextNum++; // move to next number
            }

            // check in backward direction
            int prevNum = num - 1;
            while (numMap.containsKey(prevNum) && !numMap.get(prevNum)) {
                currLength++;
                numMap.put(prevNum, Boolean.TRUE);
                prevNum--; // move to previous number
            }
            longestSeq = Math.max(longestSeq, currLength);
        }

        System.out.println("Longest consecutive sequence: " + longestSeq);

        return longestSeq;
        // https://www.youtube.com/watch?v=LvbtUMdcgbw

    }

    // best optimised
    public static int longestConsecutiveusingHashSet(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // checking if previous value not exists, then its a start of a
                                             // sequence
                int currLen = 1;
                while (numSet.contains(num + currLen)) {
                    currLen++;
                }
                longest = Math.max(longest, currLen);
            }
        }
        return longest;
        // neetcode hashset solution
    }

    public static void main(String[] args) {
        longestConsecutive(new int[] { 0, 3, 2, 5, 4, 6, 1, 1 });
        longestConsecutive(new int[] { 0, 1, 9, 6, 5, -1, -2 });
    }

}
