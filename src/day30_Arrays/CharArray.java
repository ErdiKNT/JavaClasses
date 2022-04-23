package day30_Arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'J', 'A', 'V', 'A'};

        String word = "java";
        char [] java = word.toCharArray();

        System.out.println(Arrays.toString(letters)); // [J, A, V, A]
        System.out.println(Arrays.toString(java));   //  [j, a, v, a]

        for (char eachChar : java){
            System.out.println(eachChar);
        }
        System.out.println(java[0]);


        //convert a char array to a String
        char[]day={'m','o','n','d','a','y'};
        System.out.println(day.length);
        String strDay=new String(day);


        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day);
      // System.out.println(day.toUpperCase()); cannot use String methods on a char[]


















    }
}
