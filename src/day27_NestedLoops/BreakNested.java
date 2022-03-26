package day27_NestedLoops;

public class BreakNested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i " + i);

            if (i == 3) {
                break;
            }



            for (int j = 0; j < 2; j++) {
                System.out.println("j " + j);
               // break; // If the break is placed inside the inner loop, then inner loop will stop.
            }

            System.out.println();
            //break; // If we put break here, the outer loop will work only 1 time, then inner loop will start and stop (j < 2).

        }
    }
}
