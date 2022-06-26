package day61_Maps;


import java.util.HashMap;
import java.util.Map;

public class ClassRoom {
    public static void main(String[] args) {
        // We can use custom class instead of String for the value.
        Map<Integer, Student> map = new HashMap<>();
        // Basically, we create an object from the student class and using constructor we made it unique.
        map.put(1, new Student("Erdi", 4.0, 2275));

        Student obj = new Student("Hanna", 3.9, 10);
        map.put(2, obj); // We assigned our object into a variable or reference, and we just call the reference

        map.put(3, new Student("Diana", 3.8, 14));
        map.put(4, new Student("Jehad", 3.7,29));
        System.out.println(map);

        System.out.println(map.get(5)); // null
        System.out.println(map.get(1)); // Student{name='Erdi', gpa=4.0, id=2275}; Return us to student object with an ID:1
        System.out.println(map.get(4).name); // Jehad
        System.out.println(map.get(4).gpa); //  3.7
        System.out.println(map.get(4).id); //   29



        for (int eachKey : map.keySet()){ // Returns a set of keys
            System.out.println("Rank: " + eachKey);
            System.out.println(map.get(eachKey).name); // I can get all the names from eachKey using loop.
            System.out.println();
        }

        System.out.println(map.values()); // Returns all the values from the map


        // Another way to loop, by the value
        for(Student student: map.values()){
            if(student.id<=10){
                System.out.println(student);
            }
        }

        // Another way to loop through entry
        for (Map.Entry<Integer, Student> entry  :map.entrySet()){
            System.out.println("Rank: " + entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }


    }
}
/*
        rank
        1             -student
        2             -student
        3             -student
        4             -student
        5             -student

 */
/*
containsKey(k)
      return boolean. checks if the map has the given key argument

containsValue(v)
      return boolean. checks if the map has the given key argument

keySet():
      Returns a set of the keys in the map

values():
      Return the Collection of values in the map

entrySet():
      Returns
 */