package day58_Exception;


import java.util.ArrayList;


public class RecapTry {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("BYE");

/*
     Ilk satirda sout get(5) hatali oldugundan onun icin olan catch blogu calisiyor fakat NullPointerException calismiyor.
     Eger list.get(1) yaparsak bu sefer NullPointerException kismi calisacak.
 */
        try {

            System.out.println(list.get(5));
            String s = null;
            s.toLowerCase();


        } catch (IndexOutOfBoundsException e) { // ==> This is unchecked exception because child class of the RunTimeException

            System.out.println("Index out of bonds block");
            System.out.println(e.getMessage());

        } catch (NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }

        System.out.println(list);
        System.out.println();


        try{
            Thread.sleep(-3000);
        }catch (InterruptedException | IllegalArgumentException e ){ // handles both exceptions
            System.out.println("Wrong NUMBERS");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Last line for the sleep try");
        }

    }
}
/*
Exceptions
   Issue that stops the normal flow of execution
Error
   problem not related to code
Throwable is the parent of Error and Exception classes
  Exception Class:
     - Parent of all exception types
       ==> direct child classes are checked exceptions:
             Exceptions that must be handled in compile time

  Runtime Exception Class:
     Child of Exception
       ==> child classes of the RunTimeException are unchecked, so to occur during runtime
 */