package day17_StringIntro;

public class StringMemory {
    public static void main(String[] args) {

         String str1 = "Java"; // String literal (str1 is in the stack memory, "Java" is in the string pool which is also in heap memory)
         String str2 = new String("Java"); // String object, not in String pool, but directly in the heap.
         String str3 = "Java";
         String str4 = "java";

         System.out.println(str1 == str2);// == does not look inside the variable, that's why it gives false.

         System.out.println(str1 == str3); // true. Because they are in the same memory. They are same object where is located in the string pool.

         System.out.println(str1 == str4); // They are not the same object( str1 and str4) They are stored in a different place in the string pool.

         System.out.println(str1.equals(str2)); //equals method looks inside the variable, if they are same it gives true.




    }
}
