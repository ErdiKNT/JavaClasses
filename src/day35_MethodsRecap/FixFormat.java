package day35_MethodsRecap;

public class FixFormat {


     public static String fix(String word){
         word = word.trim();
         String fixed = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
         return fixed;

     }

}
/*
Fix format
Ex:
 Input :
   jamES  Make first letter upperCase, rest of them will be lowerCase
 output :
   James
 */