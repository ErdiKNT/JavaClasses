package day28_ArraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int numberOfFriends = scan.nextInt();
        scan.nextLine();
        String[] friendNames = new String[numberOfFriends];

        for (int i = 0; i < friendNames.length; i++) {
            System.out.println("Enter your friends name");
            friendNames[i] = scan.nextLine();


        }
        System.out.println(Arrays.toString(friendNames));
    }
}
/*
Make an array of your friend names

asking how many friend do you have

then ask for each friend`s name one at a time, store all the names into an array

at the end print your friend list


 */