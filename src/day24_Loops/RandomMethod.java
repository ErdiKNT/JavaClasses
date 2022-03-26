package day24_Loops;
import java.util.Random;
public class RandomMethod {
    public static void main(String[] args) {
        Random scan = new Random();  //Scanner scan = new Scanner()

        int randomNumber = scan.nextInt(20); // It will pick random number between 0 - 20.
        System.out.println(randomNumber);

        long random1 = scan.nextLong();  // It will pick random long numbers
        System.out.println(random1);

        double random2 = scan.nextDouble(); // It will pick random double numbers
        System.out.println(random2);

        boolean random = scan.nextBoolean();  // Random true or false will be printed
        System.out.println(random);

        float random3 = scan.nextFloat();
        System.out.println(random3);
    }
}
