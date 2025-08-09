import java.util.*;

public class stringProblems {

    public static void reverseStringWithoutBuiltIns(String input) {

        char[] charStr = input.toCharArray();
        int l = 0, r = input.length() - 1;

        while (l < r) {
            char temp = charStr[l];
            charStr[l] = charStr[r];
            charStr[r] = temp;
            l++;
            r--;
        }

        System.out.println("Reversed String: " + new String(charStr));
    }

    public static void palindrom(String input) {
        int l = 0, r = input.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(input.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(input.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(input.charAt(l)) != Character.toLowerCase(input.charAt(r))) {
                System.out.println("Not matching");
                return;
            }
            l++;
            r--;
        }

        System.out.println("PALINDROM");
    }

    public static void removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char ch : input.toLowerCase().toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        System.out.println(result);
    }

    public static void nonRepeatingCharacterWithoutUsingCollection(String input) {
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.println("non-repeating char: " + ch);
                result.append(ch);
            }
        }

        System.out.println(result);
    }

    public static void nonRepeatingCharacterUsingCollection(String input) {

        Map<Character, Integer> result = new LinkedHashMap<>();

        for (char ch : input.toLowerCase().toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Unique characters: " + entry.getKey());
            }
        }


        System.out.println(result);
    }

    public static void characterCountUsingCollection(String input) {

        Map<Character, Integer> countChar = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toLowerCase().toCharArray()) {
            countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }


        System.out.println(result);
    }

    public static void reverseWordInSentence(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            char[] ch = word.toCharArray();
            int l = 0;
            int r = word.length() - 1;
            while (l < r) {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
            result.append(new String(ch)).append(" ");
        }

        System.out.println(result);
    }

    public static void mostFrequentCharacter(String input) {
//        String input = "apple is awesome";
        Map<Character, Integer> countMap = new HashMap<>();
        int max = 0;
        char result = 0; // cant use StringBuilder as it will keep the previous value in result in line 136

        for (char ch : input.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println("Frequent: " + result);
    }

    public static void getAllPossibleSubstrings(String input) {
        List<String> substringsList = new ArrayList<>();

        if (input == null || input.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                substringsList.add(input.substring(i, j));
            }
        }

        System.out.println("Substrings list: " + substringsList);
    }

    public static void removeAllSpaces(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }


        //alternate
//        result = new StringBuilder(input.replaceAll("\\s+", ""));
        System.out.println("Result: " + result);
    }

    public static void isStringRotated(String s1, String s2) {
//        String s1 = "waterbottle";
//        String s2 = "erbottlewat";

        if(s1.length() != s2.length() || s1.isEmpty()){
            System.out.println("Invalid input");
            return;
        }
        String combined = s1 + s1;
        if(combined.contains(s2)){
            System.out.println("rotated");
        }else{
            System.out.println("Not rotated");
        }
        // System.out.println("result: "+subsList);
    }

    public static void isValidShuffle(){
        String input1 = "abc";
        String input2 = "def";

        String result = "abdcef";

        int i=0,j=0,k=0;

        while(k < result.length()){
            if(i < input1.length() && result.charAt(k) == input1.charAt(i)){
                i++;
            }else if(j < input2.length() && result.charAt(k) == input2.charAt(j)){
                j++;
            }else{
                System.out.println("Invalid shuffle");
                return;
            }
            k++;
        }

        if(i==input1.length() && j==input2.length()){
            System.out.println("String is rotated");
        }else{
            System.out.println("String is not rotated");
        }
    }

    public static void toTitleCase(String input){
//        String input = "thE quICK bRowN fox";
//        result = The Quick Brown Fox

        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1)).append(" ");
        }

        System.out.println("result: "+result);

    }

    public static void longestCommonPrefix(String[] input){
//        String[] words1 = {"flower", "flow", "flight"}; - common prefix is "fl"
//        String[] words2 = {"dog", "racecar", "car"}; - no common prefix

        String prefix = input[0];

        for(int i=1;i<input.length;i++){
            while(!input[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("No prefix found");
                    return;
                }
            }
        }

        System.out.println("result: "+prefix);

    }

    public static void replaceSpaces(String input){
        input = input.replaceAll("\\s+","%20");
        System.out.println("result: "+input);

    }

    public static void getAcronym(String input) {
//        String input = "As Soon As Possible"; - result: ASAP
        StringBuilder result = new StringBuilder();

        String[] words = input.split("\\s+");
        for(String word : words){
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        System.out.println("result: "+result);

    }

    public static void isAllDigit(String input){
//        String input = "12345"; - result: Is All digit
//        String input = "123a45"; - result: Not a digit
        for(char ch : input.toCharArray()){
            if(ch != ' '){
                if(!Character.isDigit(ch)){
                    System.out.println("Not a digit");
                    return;
                }
            }
        }
        System.out.println("Is All digit");

    }

    public static int countWords(String input) {

        if (input == null || input.trim().isEmpty()) return 0;

        // Split on one or more whitespace characters
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void removeChar(String input,char value){
//        String input = "Hello World Java"; char value = 'o'; - result: Hell Wrld Java
        input = input.replaceAll(String.valueOf(value),"");
        System.out.println("result: "+input);

    }

    public static void shortestWord(String input){
//        String input = "Hello World Java"; - result: Java
        String[] words = input.split("\\s+");
        int min = Integer.MAX_VALUE;
        String result = "";
        for(String word : words){
            if(word.length() < min){
                result = word;
                min = word.length();
            }
        }
        System.out.println("result: "+result);

    }


    public static void main(String[] args) {
//        reverseStringWithoutBuiltIns("AKash");
//        palindrom("A man, a plan, a canal: Panama");
//        palindrom("race a car");
//        palindrom("m a la,= y a lam");
//        removeDuplicates("Automation");
//        nonRepeatingCharacterWithoutUsingCollection("Java is a Language");
//        nonRepeatingCharacterUsingCollection("Java is a Language");
//        characterCountUsingCollection("Java is a Language");
//        reverseWordInSentence("Java is a Language");
//        mostFrequentCharacter("aaaabbbccccddddd");
//        getAllPossibleSubstrings("avc");
        removeAllSpaces("Hello   World Java  ");

    }
}
