package day55_Polymorphism.shopping;
/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)
*/
public interface Shipping {
    String country = "US";

    void payForShipping(boolean b);
}
