package day55_Polymorphism.shopping;
/*
Create an abstract class Shopping
    - Declare two abstract methods:
        buyItem(), returnItem()
 */
public abstract class Shopping {
    public double price;

    public abstract void buyItem();

    public abstract void returnItem();
}
