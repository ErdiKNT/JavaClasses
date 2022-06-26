package day56_Polymorphism.Book;

import day56_Polymorphism.Book.Ebook;

/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */
public class JavaTextBook extends Ebook {
    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading java textbook");
    }

    @Override
    public void download() {
        System.out.println("Downloading java textbook");
    }

    @Override
    public void open() {
        System.out.println("Opening java text book");
    }
}
