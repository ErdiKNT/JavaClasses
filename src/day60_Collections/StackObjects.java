package day60_Collections;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.add('e');
        System.out.println(stack); // [a, b, c, d, e]

        System.out.println("Top of my stack: " + stack.peek()); // returns what at the top of your stack --> Last element added [Top of my stack: e]

        stack.pop();// --> Removes element from the top.
        System.out.println(stack); // [a, b, c, d]
        System.out.println("Top of my stack: " + stack.peek()); // Top of my stack: d

        System.out.println(stack.remove(2)); // ==> We can remove whatever index number we want
        System.out.println(stack); // [a, b, d]

        /*
        What is the advantage of the collection framework:

                 These data structures all define different ways to handle and use data. Whatever is best for our case, we can use.
                 There is different implementation/algorithms to solve a problem.

                 --> Performance of an action:
                     different collections can have different performance for different actions.
                        Ex: adding, removing, editing, searching

         */
        /*
        Stack: data structure that following last in, first out ==> whole purpose
         */























    }
}
