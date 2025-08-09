package StringProblems;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String sortedS1Array = new String(s1Array);
        System.out.println(sortedS1Array);

        for (int i = 0; i < s2.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                char[] s2Array = s2.substring(i, j + 1).toCharArray();
                Arrays.sort(s2Array);
                String sortedS2Array = new String(s2Array);

                if (sortedS2Array.equals(sortedS1Array)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
