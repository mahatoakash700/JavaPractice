package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecode {

    public static String encodeString(List<String> strInput) {
        if (strInput.isEmpty())
            return "";
        StringBuilder strB = new StringBuilder();
        for (String s : strInput) {
            strB.append(s.length()).append('/').append(s);
        }
        System.out.println("encoded String: " + strB);
        return strB.toString();
    }

    public static List<String> decodeString(String input) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < input.length()) {
            int slash = input.indexOf('/', i);
            int size = Integer.parseInt(input.substring(i, slash));
            result.add(input.substring(slash + 1, slash + size + 1));
            i = slash + size + 1;
        }
        result.forEach(System.out::println);
        return result;
    }

    public static void main(String[] args) {
        String decodedStr = encodeString(Arrays.asList("we","say",":","yes"));
        decodeString(decodedStr);
    }

}
