package day27_NestedLoops;

public class ContinueInNested {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {

            System.out.println("i" + i);
            if( i == 2 || i == 3){  //This one skip i2.
                continue;
            }

            for (int j = 0; j < 3; j++) {
               // if(j == 1){ // This one skip j1 condition. it will continue with j0 and j2.
               //    continue;
               // }
                System.out.println("\tj" + j);

            }

        }
    }
}
