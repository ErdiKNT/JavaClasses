package day43_Custom_Classes;

public class Address {
    String street;
    String city;
    String state;
    String zipCode;
    // UNIQUE PARAMETERS NAME
//    public Address(String inputStreet, String inputCity, String inputState, String inputZipCode){
//
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipCode = inputZipCode;
//
//    }
    // SAME PARAMETERS WITH INSTANCE VARIABLES
    public Address(String street, String city, String state, String zipCode){

          this.street = street; // Assigning the value of the local street from the parameters to the instance variable street
          this.city = city;
          this.state = state;
          this.zipCode = zipCode;
         // 'this' keyword tell the compiler the differences between local and instance variables


    }



}
