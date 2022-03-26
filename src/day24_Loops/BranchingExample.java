package day24_Loops;

public class BranchingExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int m = 0 ; m <= 10; m++){
                System.out.print(m + " ");
            }

            System.out.println();
            for(int j = 0; j <= 10; j++){
                System.out.print(j + " ");
                break;
            }

            System.out.println();
            for(int k = 0; k <= 10; k++){
                if(k == 5){
                    break; // This one ends the loop
                }
                System.out.print(k + " ");

            }

            System.out.println();
            for (int f = 0; f <= 100; f++) {
                if(f%2==1){
                    continue; // Continue will not let to loop go down if, the if statement is true. The loop will go up again, after continue is read.
                }
                System.out.print(f+" ");
            }


        }

    }
}
