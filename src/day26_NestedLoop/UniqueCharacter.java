package day26_NestedLoop;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str= "AAABCCDEEF ";
        String result = "";
        str= str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count= 0;

            for (int j = 0; j <str.length() ; j++) {

                char each = str.charAt(j);
                if(ch== each){

                    count++;

                }
            }

            if(count==1){

                result+=ch;

            }
        }

        System.out.println(result);










    }
}
/*
[IQ] Unique characters
Given a String, find and print the unique characters. A character is
unique if it only appears once in the String.
Ex:
Input:
AAABCCDEEF
Output:
BDF
-> the characters B D and F are only found in the String once so
they are unique
 */