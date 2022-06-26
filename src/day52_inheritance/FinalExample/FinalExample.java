package day52_inheritance.FinalExample;
// We can not inherit from final class.
public final class FinalExample {

    final int a = 5;
    final int b;


    public static final String PLANET = "Earth";  // constant variable
    // with this constructor, we are able to assign this final variable one time, but if we want to assign another value
    // we need to create another object. Once we create it, we are not able to change it.
    public FinalExample(int b){
        this.b = b;
    }

}
