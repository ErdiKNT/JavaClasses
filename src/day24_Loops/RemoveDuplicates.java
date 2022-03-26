package day24_Loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";//A , B ,C

        for (int i = 0; i <str.length() ; i++) {
            char ch =  str.charAt(i);// "A", "A", "B", "B", "C", "C"
            if(result.contains(""+ch)){ // if the result already contains the character skip it. Contain method is for String nor char so, add "".
                continue; //Skips
            }
            result+=ch;


        }
        System.out.println(result);
    }
}
/*
Write a program that can remove duplicates from a String
Ex:
Input: abcabc
Output: abc
 */