package day51_inheritance.lyft;
/*
Overriding must be happened in the subclass
We need inheritance to overwrite
- Access modifier of the overridden method needs to be same or more visible
- We can not override methods with the private access modifier, or with static & final specifiers
- Only the instance methods(not private & not final) can be overridden
 */
public class CarRide {
    public static void main(String[] args) {
        Lyft obj1 = new Lyft("Erdi");
        System.out.println(obj1.calculateRate(10));

        LyftXL obj2 = new LyftXL("kant");
        System.out.println(obj2.calculateRate(10));
        
    }
}
/*

1)
Method Overloading
   - Method overloading is performed within class
   - parameter must be different
   - Access specifier can be changed
   - Private and final methods can be overloaded
   - Return type of method does not matter, it can be same or different

2)
Method Overriding
   - Method overriding occurs in two classes that have IS-A relationship
   - Parameter must be same
   - Access specifier must not be more restrictive than original method
   - private and final methods can not be overridden
   - Return type must be same  in method overriding


















 */