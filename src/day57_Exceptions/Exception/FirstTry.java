package day57_Exceptions.Exception;
/*
Syntax problems are error not exceptions.
 */
public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First Line");
       /*
       Buradaki kod bize hatan var demiyor. Run yapabiliyoruz. Bu unchecked exception. Burada calistirdiktan sonra hata aliyoruz.
       Checked exceptionda hatayi duzeltmeden run yapamazsin. Seleniumda ki Thread.sleep()` de yaptigimiz gibi.
        */
      // Burada sorun olan yeri try icine yazip ignore ettirdik. First ve Last line yazdirildi.
        try{
            String word = "java";

            System.out.println(word.charAt(10)); // If we fix this code, code will run as usual Exception Happened will not be print

        }catch (Exception e){ // e is common name. Exceptions are objects.
            System.out.println("Exception happened");
        }

        System.out.println("Last Line");


    }
}
/*
What is an exception:
     something that stops the normal flow of the program. Some problem in the code
What are the 2 types of exception:
     Checked (compile time)
          Ex: Thread.sleep()

     Unchecked(run time): exception that happen after the program is run. You can handle unchecked exceptions, but you do not need to
Compile time: While compiling
Run time    : when you execute

unchecked exception is runtime exception.
How do you handle exceptions:
    with try catch
      Try block defined any code that will be executed top to bottom and if any exception occurs in from the code in the try block it can be caught and handled
      in the catch block. The catch block defined the code that will run if an exception occurs.

      Ex:  try{
      WebDriver driver = null;
      driver.get("google.com")
      }catch(NullPointerException e){

      }

Common exceptions you faced?
   NullPointerException, IndexOutOfBoundsExceptions, NoSuchElementException, StaleElementException

 */