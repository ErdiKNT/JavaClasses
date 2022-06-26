package day42_Custom_Classes;
/*
Note Again:
  Static variable can be used in instance method, but instance variable can not be use in the static method.
 */
public class Item {

    String name;
    double price;

    public String getName() { // We did these methods automatically using generate option.
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    /*
    Press right click in the class, select generate ---> toString -->
    select the variables you want to include then it will type a toString
    method automatically.
     */
}
