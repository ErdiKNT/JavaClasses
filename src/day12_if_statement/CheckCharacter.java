package day12_if_statement;

public class CheckCharacter {
    public static void main(String[] args) {
        char letter = 'B';

        if(letter>='a' && letter<='z'){
            System.out.println("Lowercase");
        }
        if(letter>='A' && letter<='Z'){
            System.out.println("UpperCase");
        }
    }
}
