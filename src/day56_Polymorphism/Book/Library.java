package day56_Polymorphism.Book;

import day56_Polymorphism.Book.Book;
import day56_Polymorphism.Book.Downloadable;
import day56_Polymorphism.Book.Ebook;
import day56_Polymorphism.Book.JavaTextBook;

public class Library {
    public static void main(String[] args) {

        JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun =true;
        book1.read();
        book1.open();
        book1.download();

        Ebook book2 = new JavaTextBook();
        book2.name = "Java Programming";
        book2.size = 20.5;
//      book2.fun = true; Ebook reference does not have access to the fun variable
        ((JavaTextBook)book2).fun = true; // Now we are able to access to fun.
        /*
        We cast the reference from the parent Ebook to the child reference of JavaTextBook and that allows us to access
        the fun variable
         */
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextBook(); // Book is an abstract class, we can not make an object such as (Book book3 = new Book)
        book3.name = "Java Programming";
        book3.read();
//      book3.size, fun, open(), download() these are the variables and methods that Book parent class can not access.


        Downloadable book4 = new JavaTextBook();
        book4.download();
//      all other variables and methods can not be accessible by the interface class which name is Downloadable.
//      Downloadable book5 = new Downloadable(); We can not make an object from interface.
        //Let's do downCasting
        JavaTextBook book5 = (JavaTextBook)book4;
        /*
        book4 was the interface reference, we cast the reference to be a JavaTextBook and assigned it to the
        book5 reference
         */
        book5.fun = true;
        book5.size = 20.5;
        book5.name = "Java Programming";
        book5.download();
        book5.open();
        book5.read();

    }
}
