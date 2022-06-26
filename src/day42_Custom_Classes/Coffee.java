package day42_Custom_Classes;

public class Coffee {

    double price;
    double size;
    String brand;
    String type;

    @Override
    public String toString() {
        return type + " from " + brand + " size of " + size + " oz. For a total price of " + price;
    }

    public void drink() {
        System.out.println("Drinking " + type);
        size -= 1.5;
    }

    public void refill(double amount) {

        System.out.println("Refilling " + amount + " oz of coffee");
        size += amount;
    }
}
   /*
    Create a coffee class with these instance variables:
      - price, size(oz), brand, types

      instance methods:

     1) make a toString to print all the information of the coffee objects

     2) drink               : print drinking type of coffee

     3) refill(amount in oz): print refilling x oz
               add the number of oz to the total size





     */