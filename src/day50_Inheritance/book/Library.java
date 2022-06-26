package day50_Inheritance.book;

public class Library {
    public static void main(String[] args){

        // not doing any inheritance here, just a main method to create my objects

        book obj1 = new book();
        // obj1 will have access to 6 instance variables

        AudioBook obj2 = new AudioBook();
        // obj2 has access to the 6 variables from the Book class and the 2 new variables in the AudioBook class:
        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        // obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();

        Ebook obj3 = new Ebook();
        // obj3 has access to the 6 variables from the Book class and the 2 new variables in the EBook class:
        obj3.size = 20.4;
        obj3.pages = 1004;
        // obj3 has access to the instance method read()
        obj3.title = "Soft skills is important";
        obj3.read();


        // using the updated Author information

        book obj4 = new book();
        obj4.title = new String("KANT");

        obj4.author = new Author("JK Rowling", 40); // made an Author object it belongs to the Book obj4 object
        // Custom klasindna acmis oldugumuz obj4`e, author clasindan acmis oldugumuz variable attach yaparsak buna sadece author clasindan obje ekleyebiliriz.
        // Eger string clasindan acmis oldugumuz variable attach yaparsak, string objesi ekleyebiliriz.
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

        //Author author = new Author(); here you are making an Author object in the main method, it is local to the main method

        // but on line 30 the object is made with the reference coming from the book object. The Author object belongs to the Book object





    }
}
