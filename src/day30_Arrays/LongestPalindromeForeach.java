package day30_Arrays;

public class LongestPalindromeForeach {
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "apple", "anna","racecar"};
        String longestPalindrome = "";

        for (String eachWord : words) {
            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length(); i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                longestPalindrome = eachWord;
            }

        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);

    }
}
