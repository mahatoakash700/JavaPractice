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

    public static void isPalindromeUsingTwoPointer(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                System.out.println("Not matching");
                return;
            }
            l++;
            r--;
        }
        System.out.println("matching");

    }

    public static void main(String[] args) {
        // isPalindrome("Was it a car or a cat I saw?");
        // isPalindrome("tab a cat");
        // isPalindromeUsingTwoPointer("Was it a car or a cat I saw?");
        // isPalindromeUsingTwoPointer("tab a cat");
        // isPalindromeUsingTwoPointer("A man, a plan, a canal: Panama");  
        // isPalindromeUsingTwoPointer("-121");  
        // isPalindromeUsingTwoPointer("-10");  
        isPalindromeUsingTwoPointer("Madam, in Eden, I'm Adam");  

    }
}
