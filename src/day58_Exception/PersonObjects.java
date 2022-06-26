package day58_Exception;

public class PersonObjects {
    public static void main(String[] args)  { // ==> We can write "throws Exception" here but that does not mean we handled, we ignore it.
     // in order to handle it use try catch
        Person obj = new Person();
        obj.setAge(-50); // ==> We need to use try-catch if we give negative. We need to create IllegalArgumentException. Unchecked exception.
                         // ==> If we do not handle with this exception, rest of the codes will not work.
        try {
            obj.setName(null);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(obj.getName());
        System.out.println(obj.getAge());





    }
}
/*
If we put null for the name, we handled and at the end we are going to see the null and 50 print out.

Custom classta metod olustururken (Developer gibi) eger checked exception varsa throws exception kullanip ignore edebiliriz. Bu durumda user metodu
kullandiginda onun handle yapmasi gerekecek yani try-catch kullanmasi lazim.

Custom classta eger developer unchecked exception olusturursa, unchecked exception hemen handle olmasina gerek yok. Herhangi birsey yazmayada gerek yok.
Kullanici eger exception sartini olusturursa main metodda kendisi handle yapmali try-catch kullanarak.
 */

/*
1- Throws
   - Added to a method signature to allow the program to compile
      ==> Does not handle the exception but allow compiling. If the execution condition is met the execution will still be thrown and the program will stop.
      ==> Useful to ignore checked exceptions
2- throw

   - How exceptions are thrown(caused)
   - Throw an exception object
   syntax :
       throw new Exception();


3- Difference between try/catch vs throws

   - Try/Catch ==> handle exceptions. Define the set of statements that should be executed if a specific execution happens.
     throws: Allowing the program to compile and if exception happens the program still stops.

 */