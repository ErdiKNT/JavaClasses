package day15_switch;

public class SwitchNumberWords {
    public static void main(String[] args) {
        int a = 3;
        switch (a) {

            case 1: // we do not use ';'
                System.out.println("one");

            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");

            case 4:
                System.out.println("four");
                // We must use break, if we do not it will print all the cases.
            default: // if the none of the cases works then default will.
                System.out.println("Invalid number from switch");
                // We must use break, if we do not it will print all the cases.
        }

    }
}
/*
Switch statementda if deki gibi condition yazilmaz. Switchin icine variable yazilir.
Bunlar byte, short, int, string veya char olabilir
long, float, double, boolean kullanilmaz.
Ayni zamanda if deki gibi condition yazamadigimiz icin shorthand operatorleride kullanamayiz. (> < >= <= != ==)
 */