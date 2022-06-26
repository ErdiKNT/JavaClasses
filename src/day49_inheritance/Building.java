package day49_inheritance;

public class Building {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.favoredHobby = "spy stuff";
        obj.talk();
        //obj.study(); This is a method made in the child class.

        Student std = new Student();
        std.name = "Fadime";
        std.age = 26;
        std.favoredHobby = "Walking";
        std.talk();
        // Above variables and methods from the parent class
        std.study();
        std.funLevel = 100;
        // Above two are from the child class [Student class]


    }


}
