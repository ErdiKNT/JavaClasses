package day37_Wrapper_ArrayList;

import java.util.Arrays;

/*
given some string, count the number of uppercase, lowercase, numbers and other characters
                aP3d572&*jd@jdJU
 */
public class CountCharacters {
    public static void main(String[] args) {
        String s = "aP3d572&*jd@jdJU";
        String upperCaseChars = "";
        int upper =0, lower =0, number=0, other =0;
        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)){
                upper++;
                upperCaseChars+=letter;
            }else if(Character.isLowerCase(letter)){
                lower++;
            }else if(Character.isDigit(letter)){
                number++;
            }else{
                other++;
            }
        }
        System.out.println("upperCaseChars = " + Arrays.toString(upperCaseChars.toCharArray())); // We can do for the others

        System.out.println("upper: " + upper);
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);
        System.out.println("other = " + other);
    }

}
