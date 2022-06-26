package day60_Collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        // Why polymorphic reference is beneficial? We could create ArrayList<Integer> list = new ArrayList<>(); Why ?
        // polymorphism basically allows us to turn HashSet into TreeSet. This is just one example
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        System.out.println(list); // [4, 10, 1, 2, -5, 10]
        System.out.println("first: " + list.get(0));
        System.out.println("last: " + list.get(list.size()-1));

        // Advantage of HashSet is there is no duplication. If we do not store duplicated info we can use HashSet
        Set<Integer> set = new HashSet<>();
        set.add(4);
//      set.add(10); ===> This is duplicate, it is not going to be written.
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        System.out.println(set); // [1, 2, 4, -5, 10] randomly ordered
//      System.out.println("first: " + set.get(0));
//      System.out.println("last: " + set.get(set.size()-1)); ===> Set does not have index numbers.!!!


        //Because set does not have indexes, we can use a loop to go through the elements
        for (int x : set){
            if(x == 2){
                System.out.println(x);
            }
        }


        //Sort my HashSet
        System.out.println(new TreeSet<>(set)); // benefit of the polymorphism concept [-5, 1, 2, 4, 10] now ordered

        // converting list to set
        System.out.println(new LinkedHashSet<>(list));  // [4, 10, 1, 2, -5] duplicate is removed
        /*
        Aslinda burada birbirinden farkli ozelliklere sahip farkli classlarin ozellklerini polimorfism konseptini kullanarak classlar arasi
        kullanabiliyoruz. Ornek olarak arrayListde duplicate vardir. Eger duplicateleri kaldirmak istiyorsak listi sete cevirebiliriz. Boylece duplciateler
        ortadan kalkmis olacak.
         */

        System.out.println(new HashSet<>(Arrays.asList(1,5,2,1,4,2,5,1))); // asList method return List type which can have the reference of the Collection
        // interface, so we are able to make an object of HashSet with these initial values


        // Basically, we turned string into array but using HashSet object, duplicates are removed.
        String s = "aaaabbbbbbcccccddddeee";
        System.out.println(new HashSet<>(Arrays.asList(s.split(""))).toString().replace(",", "")); // [a, b, c, d, e] duplicates are removed

        /*
         Above we convert the String s to an array that array is the argument of the Arrays.asList method() that array is converted to as List type
         which is allowed in the HashSet constructor because List is a Collection and Collection is the parameter type convert the HashSet which removed
         the duplicates, to a String and did String manipulation
        */

       /*
       What is the advantage of the polymorphic references
         polymorphic reference , especially the interface reference of the objects allows flexibly with methods, return types, and constructors.
            Ex:
               constructor of the collection type objects have the parameter of collection, it means any object that has is a relation with the collection
               interface can be used to call that constructor

               --> it means you can make an Arraylist from a HashSet object or a TreeSet from an ArrayList

               ex of method:
                 public static List<> method()

                    --> this method can return any object that implements the list

                 public static void method(List<>)

                    --> this method can be called by given and argument of any object that implements the List
        */

        /*
        Stack
             LIFO: Last in, First out ===> Son gelen ilk gider demek

                 Ex:
                    book1

                    add another book:
                    book2
                    book1

                    add another book:
                    book3
                    book2
                    book1
       So right now if you wanted to remove a book from the stack it would be book3 because it was the most recent added to the stack
       methods for LIFO:

          push(): add the element to the top of the stack
          peek(): return the element at the top of the stack. does not remove it, only lets you see what is there
          pop() : remove the element at the top of the stack, and returns it


          difference between push vs add
                       functionality is the same, add elements to the stack
                       add method(from collection interface) returns boolean
                       push method(from stack) returns the object it added
         */

    }
}
