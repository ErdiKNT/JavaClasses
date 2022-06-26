package day46_Static;

public class DebitCard {
    /*
    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)
     */

    long cardNumber;
    String holderName;
    String CardType;
    int pin;
    double balance;


    /*
    static variables: account type (debit)
            -> Use static block to initialize account type
     */

    static String AccountType;

    static {
        AccountType = "Debit";
        System.out.println("Account type is: " + AccountType);
    }

    /*
    Create a constructor that will create a debit card object and initialize the card number, the cardholder name, and the balance.
    The card number has to be 16 characters long to be a valid card number.
     If the length is too short or too big do not store the card number and print “Invalid card number”
     */

    public DebitCard(long cardNumber, String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
        cardNumberLength(cardNumber);
    }

    public void cardNumberLength(long cardNumber) {

        String crdnm = String.valueOf(cardNumber);
        if (crdnm.length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid Card number length");
        }
    }

    /*
    Overload the constructor to take all the instance variables.
    The card type must be either MasterCard or Visa to be valid card type.
    If it is not one of those two then do not store the type and print “invalid card type”.
    Also, the pin must be only 4 characters long.
    If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

   */

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        cardNumberLength(cardNumber);
        this.holderName = holderName;
        this.pin = pin;
        this.balance = balance;
        CardType(cardType);

    }

    public void CardType(String cardType){
        if ((CardType.equalsIgnoreCase("MasterCard") || CardType.equalsIgnoreCase("Visa"))) {
             this.CardType = CardType;
        }else{
            System.out.println();
        }
    }

    /*
    Add the toString method that will print all the cards' information (Except the pin). If the card type does not have a value do not print that line.
     */

    @Override
    public String toString() {
        return
                "cardNumber= " + cardNumber + "\n" +
                        "holderName= " + holderName + "\n" +
                        "balance= " + balance+ "\n" +
                  "CardType= " + CardType;

    }
}
