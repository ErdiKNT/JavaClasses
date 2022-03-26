package day08_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        //adding 1 to a variable
        int a = 10;
        a++;
        ++a;
        a = a+1;
        System.out.println(a);
        //add 10 to the variable

        int b=4;
                   //we can not type b++ 10 times to make it 14, it is not the efficient way to do. So we use shorthand operator.
        b = b + 10;//reads the value of b and adds 10 to it then reassign the new value in to the b variable.
        b += 10;   //Another simple way for line 15.
        System.out.println(b);

        int count = 0;
        count+=5;
        System.out.println("count = " + count);
        count-=10;
        System.out.println(count);
        count*=2;
        System.out.println(count);





    }
}
