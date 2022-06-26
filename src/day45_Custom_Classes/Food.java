package day45_Custom_Classes;



public class Food {
    /*
    - data:

            name, quantity, unit price, total price

     */
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    /*
    - constructor

            - create a constructor that creates a Food object with the name

            - create a constructor that creates a Food object with the name and quantity

            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
     */

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name); //We do not need to assign again, basically we need to just call it.
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
      //this(name);
      //this(quantity); We can not call constructor method two times. We should type this(name, quantity)
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = unitPrice * quantity;
    }


    public String toString(){
        return "Item: " + name + " ~ " + quantity + " x " + unitPrice + " for $" + totalPrice;
    }
}
