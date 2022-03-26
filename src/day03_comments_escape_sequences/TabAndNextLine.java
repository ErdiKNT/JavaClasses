package day03_comments_escape_sequences;

public class TabAndNextLine {
    public static void main(String[] args) {
        System.out.println("My name starts with 'E'");

        //Example of tab
        System.out.println("This was not tabbed");
        System.out.println("\tThis was tabbed once ");
        System.out.println("\t\tThis was tabbed twice");
        System.out.println("    This was tabbed twice");
        System.out.println("\t\t\t\tExample"); //This one is more readable.
        System.out.println("        Example");//This one is not readable.

        System.out.println("---------------------------------------------------------");
        //Example of next lines
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) wash car");
        System.out.println("---------------------------------------------------------");
        System.out.println("1) Go to store\n2) grab milk\n3) wash car");











    }
}
