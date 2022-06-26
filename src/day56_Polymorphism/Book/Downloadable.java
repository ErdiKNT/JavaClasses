package day56_Polymorphism.Book;
/*
Create an interface Downloadable
    - Declare an abstract methods:
        download();
 */
public interface Downloadable {
     /*
     We can make default, static and abstract methods in interface ====> abstract will not have body, only static and default will have body
      */

    /*
    Variables are static & final by default====> can not be instance variables
     */


    /*
    Public is the only access modifier
     */

    public abstract void download(); // ===> This is a default public abstract method



}
