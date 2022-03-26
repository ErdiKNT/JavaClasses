package day18_String;

public class ContainMethod {
    public static void main(String[] args) {
         String str = "Today it is above 70";
        System.out.println(str.contains("it is")); // True

        System.out.println(str.contains("itis"));  // False

        System.out.println(str.contains("ay it")); // True

        System.out.println(str.contains("7"));     // True

        System.out.println(str.contains("today")); // False. Starts with lower case that is why false.

        System.out.println(str.toLowerCase().contains("today")); // True. In this step, we used .toLowerCae that why it is true.


    }
}
/*
if you wanted to check for specific characters
use boolean logic
str.contains("T") && str.contains("i")&& str.contains("7")
*/