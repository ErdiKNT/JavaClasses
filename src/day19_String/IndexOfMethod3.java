package day19_String;

public class IndexOfMethod3 {
    public static void main(String[] args) {
        String word = "definition";
        //             0123456789

        System.out.println("First i: " + word.indexOf('i') );
        System.out.println("Last  i: " + word.lastIndexOf('i'));

        System.out.println("third i: " + word.indexOf('i', 6));// That one means: look for the 'i', after the index of 6. But instead of doing this
        // we can type simply "io" to find out i at 7.
        System.out.println("second i: " + word.indexOf("it"));
    }
}
