package day33_VoidMethods;

public class MyFirstMethod {
    public static void helloWorld() {  // main method yok. void method kullaniyoruz daha sonra method ismi geliyor.

        System.out.println("Hello World");
    }
    public static void helloWorld50(){ // 50 defa yazdirmak istesek bir kere method acip, bunu daha sonra istedigimiz kadar cagirabiliriz.
        for (int i = 0; i <= 50; i++) {
            helloWorld();   // Main metodun icinde tekrar tekrar for loop olustutmamiza gerek yok. Burada bir defa metod acariz ve daha sonra istedigimiz kadar cagiririz.
       }
    }

    public static void main(String[] args) {
        helloWorld50();   // Burada sadece forlu olan metodu cagirdik.

    }




}
