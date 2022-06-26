package day43_Custom_Classes;
// The static variable can be used to refer the common property of all objects. That is not unique for each object.
public class Carpet {
    double length;
    double width;
    boolean isPersian;
    double unitPrice;
    double totalPrice;
//    static int prc = 2;  ---> We assigned static variable here, but we can also re-assign in the main method.

    public Carpet(double inputLength, double inputWidth, boolean inputPersian,double inputUnitPrice
                  ){
        length = inputLength;
        width = inputWidth;
        isPersian = inputPersian;
        unitPrice = inputUnitPrice;
        calculatePrice(); // This is increases the usability of the program
    }


    public void calculatePrice(){

        totalPrice =  width * length * unitPrice;

        if(isPersian){
            totalPrice +=200;
        }

    }


    @Override
    public String toString() {
        return (isPersian ? "The Persian Carpet " : "The Carpet ") +
                "\nhas dimensions of " + length + " x " + width +
                "\nThe unit price is $" + unitPrice +
                "\nAll coming to a total of $: " + totalPrice;
    }
}
