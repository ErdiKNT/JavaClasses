package day57_Exceptions.Exception;

public class SecondTry {
    public static void main(String[] args) {

        try {

           // String s = null;
            String s = "java"; // ==> There is no problem in this code, typing like this will not throw exception.
            System.out.println(s.length()); // null.length()

            int[] a = {1, 4, 5, 2};// ==> This is not NullPointerException, This is OutOfBoundException
            System.out.println(a[10]);

        } catch (NullPointerException e) { // ==> wHEN WE only put NullPointerException, only NullPointerExceptions works. We ignore other exception by typing specific one
            System.out.println("Caught a null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e){ // ==> This is for array. Because there is error in the try block.
            System.out.println("Caught the Array index out of Bounds");
        }
       /*
       But if we write just Exception e ==> This is for general
       Yukarida specific olarak exceptionlari belirttik. Iki tane exception var NullPointer ve ArrayIndexOutOfBounds. In order to catch both of them
       we need to type two catch scenario the one is for NullPointer and another one is for IndexOutOfBounds
        */

    }
}
