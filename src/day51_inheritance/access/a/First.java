package day51_inheritance.access.a;

public class First {
    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;
    final public int five = 5;

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);  // ---> public
        System.out.println(obj.two);  // ---> protected
        System.out.println(obj.three);// ---> default
        System.out.println(obj.four); // ---> private
        System.out.println(obj.five); // ---> final
    }

}
