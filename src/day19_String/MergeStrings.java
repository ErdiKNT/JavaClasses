package day19_String;

public class MergeStrings {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";

        System.out.println(""+str1.charAt(0)+str2.charAt(0)+str1.charAt(str1.length()-2)+str2.charAt(str2.length()-2)
        +str1.charAt(str1.length()-1)+str2.charAt(str2.length()-1));






    }
}
/*
two strings : hard code to have 3 characters
merge the Strings together
   ex:
      abc
      xyz
   output:
      axbycz
*/