package day47_Encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCardSaim.accountType);

        DebitCardSaim obj1 = new DebitCardSaim(1234567891112141L, "James", 10000000);
        System.out.println(obj1);

        System.out.println();
        DebitCardSaim obj2 = new DebitCardSaim(123456789111211L, "Ben", 100000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println();

        DebitCardSaim obj3 = new DebitCardSaim(1234567891112141L, "James", "Visa", 7000, 10000000);
        System.out.println(obj3);
        System.out.println();
        //Invalid values
        DebitCardSaim obj4 = new DebitCardSaim(1234567892141L, "James", "Visa", 7, 10000000);
        System.out.println(obj4);


    }
}
