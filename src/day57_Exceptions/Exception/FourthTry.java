package day57_Exceptions.Exception;

public class FourthTry {
    public static void main(String[] args) {

        try{
            System.out.println("Start");
            Thread.sleep(-2000);
            System.out.println("Finish");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage()); // This is the message that we see in the IllegalArgumentException error. Basically we print out this message.

        }
    }
}
/*
What is an error?
   Stops the normal flow of the execution, but errors are issues not directly related to the code.
   You might not be able to handle/fix it.
   Ex: Memory issue, internet issue, environments issue.

What is an Exception?
   Stops the normal flow of the execution, it is directly related with the code.

Multiple catch blocks
   It is possible to have multiple catch block to handle different kinds of exceptions
      ==> Note: You want to make the exceptions as specific as possible to not allow anything that you did not intend.

      Rule: Order of the catch blocks does matter. The Exceptions should be most specific at the top and become more general towards the end.

Finally, Block:
   It is optional to add to try/catch
   This code block will run no matter, if there is an exception or not.
   Common use case: Helps to close and shut down properly.
       Ex: Scanner close the object
           File is open ==> File closes properly so there is no issue

Exception as object
    Exceptions are object which means there are methods that can be used
     Useful Methods:
       - printStackTrace():
           Outputs the full exception message to the console
             ***
              java.lang.IllegalArgumentException: timeout value is negative
	at java.base/java.lang.Thread.sleep(Native Method)
	at day57_Exceptions.Exception.FourthTry.main(FourthTry.java:8)
	         ***

       - getMessage():
          Display the message of an exception, which is usually defined by the exception.
              == timeout value is negative ==

 */