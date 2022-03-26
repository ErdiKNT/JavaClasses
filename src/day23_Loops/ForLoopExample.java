package day23_Loops;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {  // If we know how many times we need to loop, this is the best loop
            System.out.println(i);
        }


        int z = 1;

        while(z<=10){                   // If we do not know how many times we need to loop, this is the best one.
            System.out.println(z);
            z++;

        }


//fadime komurcu  rukiye seni cok sevi




    }
}
/*
Flow of for loop
  1) The loop executes the initialization part to declare and assign a variable

        - initialization: int i = 1;
        - initialization part runs once in the beginning
        - in our example: int i = 1;

  2) boolean condition / termination condition

        - if the boolean is true : the loop will execute the statements
        - if the boolean is false: the loop wil stop
        - in our example: 1<=10

  3) the statements in the code body are executed top to bottom

        - in our ex: System.out.println(i);

  4) update happens -- this is the end of an iteration

        - in our example: i++

  5) goes back to step 2 and repeats
 */