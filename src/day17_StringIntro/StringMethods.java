package day17_StringIntro;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Fadime";
        System.out.println(name.equals("Fadime")); //Equals method checks every single character in the object.
        System.out.println("cat".equals("dog"));   //False
        System.out.println("Hello World".charAt("Hello World".length()-1));// Equals method returns boolean.

        String a = new String("Hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); // Check every single characters in the object. FALSE
        System.out.println(a.equalsIgnoreCase(b));// TRUE

        System.out.println(name.length()); // It gives the length of characters.
        String str1 = "Today was fun";
        System.out.println(str1.length());  //13 characters
        System.out.println(str1.length()-1);//12
        System.out.println(str1.length()-2);//11
        System.out.println(str1.charAt(str1.length()-1));// n is the 12th character.


    }
}
