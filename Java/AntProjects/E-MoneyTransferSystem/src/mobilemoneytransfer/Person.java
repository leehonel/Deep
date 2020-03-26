//This is the super-class for the Customer and Agent classes
//It contains all the properties and methods that are common to its sub classes
package mobilemoneytransfer;
import static mobilemoneytransfer.ServiceProviderAndBank.outputNext;

//import java.io.*;

public class Person {
    
    public static String userFirstName,userLastName,userDob,userPin;

    public static int  userNatId;
    public static String userBio; //userBio is a summation of all the details of a user that are obtained from this class
    
    
    //Test method
    public static void testOnePerson(){
        outputNext("The person superclass is okay!");    
    }
    
    
    
    /*
    public Person(String user){
        outputNext("Creating and account for "+userBio.toLowerCase()+"...\n");
    }
    */
    
    
   
}
