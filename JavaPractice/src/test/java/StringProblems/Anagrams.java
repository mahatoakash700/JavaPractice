package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedS = new String(charArr);

            if (!result.containsKey(sortedS)) {
                result.put(sortedS, new ArrayList<>());
                System.out.println("map1: " + result);

            }
            result.get(sortedS).add(s);
            System.out.println("map2: " + result);
        }

        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        String[] input = { "act", "pots", "tops", "cat", "stop", "hat" };
        groupAnagrams(input);
    }

}
