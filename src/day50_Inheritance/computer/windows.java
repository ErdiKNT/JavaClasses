package day50_Inheritance.computer;

public class windows extends Computer{
     // We call the os and memory variables from the Computer class. If we have a constructor in the parent class, we must make one constructor in the subclass
    // and call the parent class constructor into the subclass constructor by the super(parameters) keyword.
     public windows (int memory){

         super("Windows",memory);

     }

}
//Calls the parent constructor which sets the os variable to be "Windows" and sets the memory variable to be the argument from the windows constructor