package StringProblems;

public class ReverseStringOrArray {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb);
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        isPalindrome("Was it a car or a cat I saw?");
        isPalindrome("tab a cat");
    }
}
