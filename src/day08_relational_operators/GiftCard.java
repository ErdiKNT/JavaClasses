package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        int giftCard = 200;

        giftCard-=50;
        System.out.println("Remaining balance after item 1: " + giftCard);
        giftCard-=75;
        System.out.println("Remaining balance after item 2: " + giftCard);




    }
}
/*
Declare and assign a gift card with $200
buy 2 items. Buy 1 item for x price and subtract from your gift card
buy item 2 for x price and subtract from your gift card
print the remaining balance of your gift card
*/