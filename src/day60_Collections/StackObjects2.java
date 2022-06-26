package day60_Collections;

import java.util.Stack;

public class StackObjects2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.add(20);
        stack.add(100);
        stack.push(30);

        System.out.println(stack); // [40, 20, 100, 30]
        System.out.println(stack.peek()); // ==> peek method is in the Stack class
        System.out.println(stack.lastElement()); //===> lastElement() method is in the vector class, but we can use it


        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 100
        System.out.println(stack); // [40, 20]


    }
}
