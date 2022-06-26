package day50_Inheritance.book;
// Ebook is a book
public class Ebook extends book {
     double size;
     int pages;

     public void read(){
         System.out.println("Reading a digital copy of " + title); // title is instance variable from the book class
     }

}
/*
  - Ebook class inherits Book class

  - Create additional variables:
      size, pages

  - Create method:
        read()
 */