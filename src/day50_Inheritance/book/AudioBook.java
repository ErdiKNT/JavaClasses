package day50_Inheritance.book;
//AudioBook is a book
public class AudioBook extends book{

    double duration;
    String narrator;
     // Basically, we called title instance variable from the parent class.
     public void listen(){
         System.out.println("Listening to " + title + " narrated by " + narrator);
     }



}
/*
AudioBook class

   - AudioBook class inherits Book class
   - Create additional variables:
       duration, narrator

   - Create Method:
       listen()

 */