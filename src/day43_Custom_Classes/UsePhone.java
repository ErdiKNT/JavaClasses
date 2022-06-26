package day43_Custom_Classes;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung Note 8");
        System.out.println(phone1); // calls constructor on line 9




        Phone phone2 = new Phone("iphone 12", "Apple");
        System.out.println(phone2); // calls constructor on line 14

        Phone phone3 = new Phone("note 20","Samsung",64,2.5);
        System.out.println(phone3);



    }
}
