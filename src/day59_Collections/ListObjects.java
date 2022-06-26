package day59_Collections;



import java.util.*;

public class ListObjects {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Reference of the interface List, but the object is ArrayList Object.
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));

        List<String> list2 = new LinkedList<>(); // Reference of the interface List, but the object is LinkedList object.
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));
        System.out.println(list2.size());
        /*
        Burada polymorphismde yaptigimiz gibi yaptik. Parent classi reference olarak aldik ve icine subclass olan ArrayList ve LinkedListden objeler atadik.
        Burada kullandigimiz metodlar ===> add, get List interfaceden geliyor. ArrayListden degil!!! Ayni sekilde size metoduda oyle. List interfacinden
        ArrayList subclasina cagrilmis.
         */

        List<String> list3 = new Vector<>();  // Reference of the interface List, but the object is Vector object.
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add(null);
        list3.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));
        System.out.println(list2.size());

        Vector<String> list4 = new Stack<>(); // Stack is Vectorun alt classi.
         // Vector class is basically is like older version of the ArrayList
    }
}
/*
Collection bir cok objenin tek bir noktada toplanmasi diyebiliriz. Burada new Vector, new LinkedList, new ArrayList objelerini tek bir classta List de topladik.

Her processin threadleri var. Islemci bunlar icin schedule yapar ve islemi yerine getirir. Diyelim ki ben ve fadime ayni banka kartini kullaniyoruz
ikimizde ayni anda farkli atmlerdeyiz ve 500 dolar para cekecegiz. Toplamda 1000 dolar yok hesapta. Thread safe bizim ayni anda fazla para cekmemize engel olur
Bu durumda ben bir threadim, fadimem oteki thread ayni anda ikimiz tek bir elemente yuklenmis oluruz. Eskiden bilgisayarlar yavasken vector clasi daha cok kullanilirdi
tek seferde tek bir thread islenirdi daha sonra oteki threade gecilirdi. Fakat ArrayList vectorden daha hizli ve multiple threadleri ayni anda processe
sokabiliyoruz senkronize calisiyorlar.

Mesela smoke test yapacagiz google chromeda, edgede veya firefoxda. Tek bilgisayarda sirayla beklememiz gerekir. Ayni anda farkli pclerde deneyebiliriz.
 */

/*
Collection Framework: a group of interfaces and class that define how data structures will handle data.
          ==> only work with objects, not primitive types
main interfaces:

           collection: the parent of all other collections types. This interface defines the most common action(methods) that a collection should have.
               Ex: add, remove, size

           List : Ordered(index), allows duplicates
           Set  : unordered(no index), does not allow duplicates

Classes that implement the List interface:

    - ArrayList : data structure that uses arrays internally. Resizable array

          ==> useful for storing information
          ==> faster than Vector, because ArrayList is not synchronized
    - LinkedList: data structure that uses nodes internally

          ==> node: an object that has the element, the reference of the previous node, and the reference of the next node

                 Ex: node{
                          element
                          previous
                          next
                    }
           ==> useful for manipulating data
    - Vector : Legacy version of ArrayList, it uses array internally, but its synchronized

          synchronized(thread safe): Multiple threads cannot access at the same time. If there is multiple threads they will go one at a time.
                 Ex: atm ==> you want to access to atm one at a time, so it is thread safe
                             if the atm was not thread safe then multiple people(threads) can interact at the same time --> that could cause problems like overdrafting


           ==> useful for thread safety

Classes that implement the Set interface:

       HashSet      :data structure that uses HashMap internally. Hashing algorithm, which means its handles' data fast and efficiently

       LinkedHashSet:data structure that uses nodes. Insertion order is maintained

        TreeSet     : Implements the SortedSet interface. Elements are stored in their natural order(sorted)
                   --> can not have full element


















 */