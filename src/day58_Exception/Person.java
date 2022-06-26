package day58_Exception;

public class Person {

   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception { //==> throws Exception will allow us to compile
        if(name == null || name.isEmpty()){
            throw new Exception("Name can not be null or empty");// ==> This is checked exception, it must be handled. But we ignore this exception by typing throws Exception.
        }                                                        // ==> Once user use this method, user must handle with this exception, not the developer.

       this.name = name;
    }

    public void setAge(int age) {

       if(age < 0 || age > 120){ // ==> This is unchecked exception we do not need to handle right away, or we do not need to ignore.
           throw new IllegalArgumentException("Age should be more than 0 or less than 120"); // ==> unchecked exception, because subclass of the Runtime.
       }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
