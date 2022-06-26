package day60_Collections;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
//        queue.get(); get method is from list
        System.out.println(queue); // will be printed from smallest to biggest
        queue.offer(30); // ==> offer method is like add method
        System.out.println(queue);

        System.out.println(new PriorityQueue<>().remove());// ==> Throws exception because there is no element.
        System.out.println(new PriorityQueue<>().poll());  // ==> causes exception because there is no element. poll() and remove() are the same methods

       /*
       Queue
         interface the follow FIFO: First in, first out
            --> think of a line of people. First person in line will get helped first
         classes that implemented Queue:
            PriorityQueue: data structure stores elements randomly. null is not allowed
            ArrayDeque   : implements Deque interface.
               Deque interface: allowing access to elements from the beginning and the end
                    ==> LinkedList is also implementing this interface


          METHODS:
                add()      <-----> offer()
                remove()   <-----> poll()
                element()  <-----> peek()
                the methods on the left side : add, remove, element will cause an exception if they are not used correctly.
                the methods on the right side: offer, poll, peek will return null
        */

    }
}
