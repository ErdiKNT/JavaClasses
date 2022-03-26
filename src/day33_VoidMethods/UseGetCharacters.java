package day33_VoidMethods;

public class UseGetCharacters {
    public static void main(String[] args) {
        GetCharacters.letterUpperCase();
        GetCharacters.letterSmallerCase();
        GetCharacters.reverseUpper();
        GetCharacters.reverseLower();
        GetCharacters.numbers();

        // We called methods from the other class
        //by typing first classname and method name
        /*
         We can call methods from GetCharacter class. Static allows us to call methods by the class name
         But if we need to call in the same file we do not need to call class name

         void --> no return value. The method will execute some code, but no value is going to come
         out of it.

         Public --> access modifier, allows us to call the method in the whole project
          -> until we say or see anything else, we will use public or our methods

         Main method --> a special method that is executed when the code is run
         custom method --> will not run by themselves, we have to call/use them somewhere
         */

    }

}
