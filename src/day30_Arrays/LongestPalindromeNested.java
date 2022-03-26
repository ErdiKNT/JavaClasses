package day30_Arrays;

public class LongestPalindromeNested {
    public static void main(String[] args) {
        String[] palindrome = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String str = "";
        String str1 = "";
        for (int i = 0; i < palindrome.length; i++) {
            str = palindrome[i];
            str1 ="";
            for (int j = str.length()-1; j >= 0; j--) {
                str1 += str.charAt(j);
            }

            if (str.equalsIgnoreCase(str1)) {
                System.out.println(str1);
            }

        }


    }
}
/*
        [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
 */