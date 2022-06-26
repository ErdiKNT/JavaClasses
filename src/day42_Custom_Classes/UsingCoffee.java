package day42_Custom_Classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee action = new Coffee();
        action.price = 4.99;
        action.size = 16;
        action.brand = "Starbucks";
        action.type = "black";

        System.out.println(action);
        action.drink(); // -1.5 Her defa ictigimizde size -1.5 azalacak
        action.drink(); // -1.5
        action.drink(); // -1.5
        action.drink(); // -1.5 Burada size 10 oz olacak

        action.refill(8); // Burada 8 oz refill yapiyoruz
        System.out.println(action); // 18 oZ elde ederiz.


    }
}
