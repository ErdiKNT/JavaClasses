package day18_String;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "Last Example";
        System.out.println(str.isEmpty());  // There are character sequences which means it is not empty.

        str = " ";
        System.out.println(str.isEmpty());  // False. Because there is space which is considered as a character.

        str ="";
        System.out.println(str.isEmpty());  // True.

        String str1 = " ";
        System.out.println(str1.isBlank()); // There is no character in the string that makes it true.

        str1 = "";
        System.out.println(str1.isBlank()); // Ture.
    }
}
/*
For the blank if the string "" or " " it returns true.
For the empty method if the string contains " " it returns false. Because the space is considered as a character.
 */