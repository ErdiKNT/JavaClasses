package day24_Loops;

public class Syllables {
    public static void main(String[] args) {
          String str = "ja-va-er-di-fa-di-me";
          int count = 1;
        for (int i = 0; i < str.length(); i++) {
                  if(str.charAt(i) == '-'){
                      count+=1;
                  }
        }
        System.out.println(count);
    }
}
/*
Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2
 */