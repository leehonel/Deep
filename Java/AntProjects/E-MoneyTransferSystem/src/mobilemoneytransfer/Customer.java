package mobilemoneytransfer;
import java.util.Scanner;
import static mobilemoneytransfer.Person.userBio;
import static mobilemoneytransfer.ServiceProviderAndBank.nameOne;
import static mobilemoneytransfer.ServiceProviderAndBank.nameTwo;
import static mobilemoneytransfer.Person.userDob;
import static mobilemoneytransfer.Person.userNatId;
import static mobilemoneytransfer.Person.userPin;
import static mobilemoneytransfer.ServiceProviderAndBank.outputSame;
import static mobilemoneytransfer.ServiceProviderAndBank.outputNext;


public class Customer {
   // public static String nameOne, nameTwo;
    //Scanner keyBoardInput = new Scanner(System.in);
    public static Scanner keyBoardInput = new Scanner(System.in);
    public static float customerAmount;   //This is the virtual amount that is currenty in the user's account
    public static float amountToSend;
    public static float newCustomerAmount;
    
    
    public static void testOneCustomer(){
        //outputSameln("The customer subclass is okay!\n\n");
        outputNext("The customer subclass is okay\n\n");
    }
    
    /*
    public static String createCustomer(){
        outputSame("Enter the customer's details below\nNames: ");
        nameOne = keyBoardInput.next();
        nameTwo = keyBoardInput.next();
        outputSame("ID number: ");
        userNatId = keyBoardInput.nextInt();
        outputSame("DOB: ");
        userDob = keyBoardInput.next();
        outputSame("PIN: ");
        userPin = keyBoardInput.nextInt();
        
        userBio = nameOne.toUpperCase()+" "+nameTwo.toUpperCase();
        return userBio;   
    }
    */
    
    //customer object instantiation
    public Customer(){
        outputSame("Enter the customer's details below\nNames: ");
        nameOne = keyBoardInput.next();
        nameTwo = keyBoardInput.next();
        outputSame("ID number: ");
        userNatId = keyBoardInput.nextInt();
        outputSame("DOB: ");
        userDob = keyBoardInput.next();
        outputSame("PIN: ");
        userPin = keyBoardInput.nextInt();
        
        userBio = nameOne.toUpperCase()+" "+nameTwo.toUpperCase();
        outputSame("Creating and account for customer"+userBio.toLowerCase()+"...\n"); 
    }
    
    public void customerReciept(){
        outputNext("\n**********");
        outputNext("Below is the customer's reciept:");
        outputNext(userBio);
        outputNext("ID: "+userNatId);
        outputNext("Date of Birth: "+userDob);
        outputNext("Current Balance: "+customerAmount);
    }
    
    public float sendMoney(float amountToSend){
        
        return newCustomerAmount;
    }
    
    
    
   
    
}
