package day27_NestedLoops;

public class UniqueCharWithBoolean {
    public static void main(String[] args) {
        String str = "AAABCCDEEEF";

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {

                char inner = str.charAt(j);

                if(letter != inner){

                    isUnique = false;

                }




            }






        }
    }
}
