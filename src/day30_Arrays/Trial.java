package day30_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Trial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(", ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if(arr[i].length()<arr[j].length()){

                }

            }


        }




    }
}
/*
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */