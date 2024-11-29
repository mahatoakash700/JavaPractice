package StringProblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {

    public static int getLongestSubstringWithoutDuplicatesOptimised(String s) {
        // https://www.youtube.com/watch?v=swBjx46TSP4 - explanation
        // https://www.youtube.com/watch?v=3IETreEybaA - code

        int left = 0;
        int right = 0;
        int max = 0;

        Set<Character> charSet = new HashSet<>();

        while (right < s.length()) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                // max = Math.max(max, charSet.size());
                if (max < charSet.size()) {
                    max = charSet.size();
                }
                right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max length: " + getLongestSubstringWithoutDuplicatesOptimised("xxxx"));
        System.out.println("max length: " + getLongestSubstringWithoutDuplicatesOptimised("zxyzxyz"));
        System.out.println("max length: " + getLongestSubstringWithoutDuplicatesOptimised("zxy@ zxy12@!"));

    }

}
