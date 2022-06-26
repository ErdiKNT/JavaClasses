package day55_Polymorphism.shopping;

import day14_if_statements.AmazonPrime;

public class Runner {
    public static void main(String[] args) {

        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();
       // target.payForShipping(true) Target class does not implement the Shipping interface

       Amazon amazon = new Amazon();
       amazon.price = 1000;
       amazon.buyItem();
       amazon.returnItem();
       amazon.payForShipping(true);
       amazon.viewCart();

        System.out.println(amazon.country);
        System.out.println(Shipping.country); // proper way to access static information in the interface

    }




}
/*
Shopping and onlineShopping are abstract classes, so we can not make object of them
Shipping is an interface, so we can not make an object of it
 */