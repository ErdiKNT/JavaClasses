package day43_Custom_Classes;

public class UseThisClass {
    public static void main(String[] args) {
        //Burada parametre instance variable bagli fakat metodun icinde local variable oldugundan oncelik ona ait. O yuzden 300 yazmaz.
        // Fakat this.a yazarsak this kelimesi javaya onceligin instance variable oldugunu soyler ve onuda yazdirir.
        ThisKeyword obj = new ThisKeyword(300); //400 Java priorities the local variable which is 400 in this case

        System.out.println(obj.a);// 500

    }
}
