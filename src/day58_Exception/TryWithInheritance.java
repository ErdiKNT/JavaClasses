package day58_Exception;

import java.security.spec.ECField;

public class TryWithInheritance {
    public static void main(String[] args) {

        try{

        }catch (IndexOutOfBoundsException e){ // ===> More Specific

        } catch(RuntimeException e){

        }catch (Exception e){                 // ===> General

        }


        /*
        *** Polymorphism ***
        Possible references for IndexOutOfBoundsException

            - IndexOutOfBoundsException obj = new IndexOutOfBoundsException();

            - RunTimeException obj  = new IndexOutOfBoundsException();

            - Exception obj   = IndexOutOfBoundsException();
         */

        /*
        From more specific to more general is the one we need.
        try{

        }catch (Exception e){

        } catch (RuntimeException e){

        }
        ===> This is reverse not that we want
         */



    }
}
