package day30_Arrays;

public class longestPalindrome2 {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        // outer loop is iterating through the array
        for(String eachWord : words){ // eachWord == words[i]

            boolean isPalindrome = true;

            // inner loop is iterating through each String element
            for(int i = 0; i < eachWord.length()/2; i++){

                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }

            }

            if(isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }

        }

        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
    }

}
