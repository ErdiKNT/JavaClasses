package day58_Exception.bank;

public class UserAccountClass {
    public static void main(String[] args) throws InvalidCredentialsException, InterruptedException {


        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);

       // accountOne.withdraw(2000);

       // accountOne.LogIn("Erdi", "004"); // ==> There is a checked exception, we must handle using try-catch. throws Invalid... is just for
                                                         // ==> ignoring the exception.


       // valid LogIn ==> This one does not throw exception, because credentials are valid
        try{
            accountOne.LogIn("jamesbond", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

       // Invalid Password ==> This one will throw checked exception, we must ise try-catch in order to handle
        try{
            accountOne.LogIn("james", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        // Invalid password ==> This one will throw checked exception, we must use try-catch in order to handle
        try{
            accountOne.LogIn("jamesbond", "something");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        Thread.sleep(2000);// ===> This one is subclass of Exception. So, this is checked exception, we can ignore it using throws Exception

    }
}
/*
Custom Exceptions:

   ==> We did practice for understanding how exceptions work

       We made a class
            - Inherited the RunTimeException class we made an unchecked exception
            - Inherited the Exception class we made a checked exception
       call the super constructors to assign the messages

       When we created/throw a checked exception, as the person creating the class/object/file, I did not want to handle it,
       I wanted the users to handle the exception so, we used throws to ignore the exception, allowing the code compile.

IQ:
   What is difference between final, finally, finalize?
         final   ==> keyword that prevents a variables value from changed, prevents a class from being inherited, prevents the method from being
                   overridden
         finally ==> block a part of try/catch blocks. Block of code that is run no matter.
         Finalize() ==> method that helps to clean up memory (is a method call garbage collection)
                   - memory:
                        java handles memory management

                        stack:
                           reference, primitive variables, method frames ==>methods will be in the stack

                        heap:
                           objects, String pool   ===> instance variables and methods part of the objects


                 EX:
                     WebDriver driver = new ChromeDriver();

                     WebDriver driver   --> Reference --> This part goes to stack
                     new ChromeDriver() --> Object --> This one goes to heap

                 Garbage Collector:

                     Remove objects from the heap when they do not have a reference. Because if there is no reference that means no longer need it.

                             Stack                             Heap
                        WebDriver driver --->           new ChromeDriver();

                      WebDriver driver = null; doing this means, I lost reference to the ChromeDriver object, and eligible to Garbage collector

                 System.gc() --> Suggest the garbage collection to run, but it's not guaranteed.
-----------------------------------------------------------

Collections
       data structure: hold/handle multiple data

       1) Array       : stored primitive and non - primitive data. size is fixed
       2) Collections : different ways to handle/manipulate data

Collection Framework
       Group of interfaces and classes that define how different data structures will store/manipulate data

       3) Collections type can only hold objects types

Main interface of the collection framework:

      Collection: the parent of all Collection types. This interfaces defined the main functionalities of a collection
                    ex: add, remove, size
  Q: What is the different between Collection and Collections

      Collection  : interface that is inherited and implemented in the collection object
      Collections : a utility class that has some useful methods that work with collection types. Not part of the
                    collection framework
                    Ex: sort, frequency



























 */