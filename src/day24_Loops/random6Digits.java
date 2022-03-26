package day24_Loops;
import java.util.Random;
public class random6Digits {
    public static void main(String[] args) {
        Random number = new Random(); //Scanner scan = new Scanner
        String str = "";
        String unique = "";

        while(unique.length()<6){
            int num = number.nextInt(9);
            str = "" + num;
            if(unique.contains(str)){
                continue;
            }
            unique+=num;
        }
        System.out.println(unique);
    }
}
