package day55_Polymorphism.Clothes;

import jdk.swing.interop.SwingInterOpUtils;

public class Store {
    public static void main(String[] args) {

        //All possible Objects of Tshirt
        TShirt tShirt1 = new TShirt(); // Reference of itself
        tShirt1.wear();

        Clothes tshirt2 = new TShirt(); // Reference of Parent
        tshirt2.wear();

        Object tshirt3 = new TShirt();
//      tshirt3.wear(); ==> Object class is parent all the class, so it can not call method from subclass.

//      HasHood tshirt4 = new TShirt(); ==> There is no relation between HasHood and Tshirt

        // ---------------------------

        //All possible Objects of Jacket
        Jacket jacket = new Jacket(); // reference of itself
        jacket.wear();
        jacket.putOnHood();

        Clothes jacket2 = new Jacket();// reference of the parent class.
        jacket2.wear();
//      jacket2.putOnHood(); ==> Clothes reference does not have access to a putOnHood()

        Object jacket3 = new Jacket(); // reference of super class object
//      jacket3.wear();
//      jacket3.putOnHood(); ==> Object class can not call features which is belonged to the subclasses


        HasHood jacket4 = new Jacket();
//      jacket4.wear(); ==> hAShOOD INTERFACE does not know about wear() method. Because we are getting info from interface(HasHood) to subclass(Jacket) not the vice versa.
        jacket4.putOnHood();

        buy(jacket2);
        buy(tShirt1);
        buy(new TShirt());
        buy(new Jacket());


    }

    public static void buy(Clothes clothes){
        if(clothes instanceof TShirt){ //==> instanceOf mean object of a class
            System.out.println("Bought TShirt");
        }else if(clothes instanceof Jacket){
            System.out.println("Bought a cool Jacket");
        }
    }





}


