package day15_switch;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = scan.nextLine();
        System.out.println("Enter your url");
        String url = scan.nextLine();


        switch (browser) {
            case "Opera": // we can not use || operator in the one case, so we should add another case.
            case "opera":
                System.out.println("Opening " + url + " in the opera browser");
                System.out.println("Loading...");
                break;
            case "safari":
            case "Safari":
                System.out.println("Opening " + url + " in safari");
                System.out.println("Loading...");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("Opening " + url + " in the firefox");
                System.out.println("Loading...");
                break;
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome");
                System.out.println("Loading...");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
                break;
        }


    }
}
