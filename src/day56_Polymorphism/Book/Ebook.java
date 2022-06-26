package day56_Polymorphism.Book;

import day56_Polymorphism.Book.Book;
import day56_Polymorphism.Book.Downloadable;

/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
public abstract class Ebook extends Book implements Downloadable {
    double size;

    public abstract void read();

    public abstract void open();
}
