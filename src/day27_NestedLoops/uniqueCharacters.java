package day27_NestedLoops;

public class uniqueCharacters {
    public static void main(String[] args) {
        String input = "AAABCCDEEF";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int count = 0; // This will be reset after the inner loop ends each time.
            for (int j = 0; j < input.length(); j++) {

                char inner = input.charAt(j); //Inner loop will check A letter will every other single letters one by one. Then A+1, same...
                if (letter == inner) {
                    count++;// If counter will be more than 1, that means there are more than 1 of that letter and, it can not be unique.

                }

            }
            if (count == 1) { // This is the only situation that letter can be unique. In this condition, take that letter and put it into result.
                result += " " + letter;
            }


        }
        System.out.println(result);
    }
}
/*
[IQ] Unique characters

    Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            BDF

        -> the characters B D and F are only found in the String once so they are unique
*/