package mobilemoneytransfer;
import java.util.Scanner;
import java.io.*;   //* indicates we are importing the entire java.io package
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
    public static String customerBio;
    
    
    
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
    
    public static void customersFile(){
        //creating the customers.txt file
        String columnsOne = "Users\n******";
        try(BufferedWriter writerWrite = new BufferedWriter(new FileWriter("customers.txt"))){  //this overwrites the existing customer.txt file if there is one that already exists.
            writerWrite.write(columnsOne);
            writerWrite.newLine();
            
        } catch (IOException e) {
            outputNext(e.getMessage());
        }
    }
    
    //customer object instantiation
    public Customer(){
        outputSame("Enter the customer's details below\nNames: ");
        nameOne = keyBoardInput.next();
        nameTwo = keyBoardInput.next();
        //to ensure the values entered are of type int.
        try {
            outputSame("ID number: ");
            userNatId = keyBoardInput.nextInt();
            
        } catch (Exception e) {
            outputNext("The number you entered is invalid, please enter a valid ID number!");
        }
        outputSame("DOB: ");
        userDob = keyBoardInput.next();
        outputSame("PIN: ");
        userPin = keyBoardInput.next();
        
        userBio = nameOne.toUpperCase()+" "+nameTwo.toUpperCase();
        customerBio = nameOne.toUpperCase()+"       "+nameTwo.toUpperCase()+"       "+userNatId+"       "+userDob+"     "+"     "+userPin;
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
    
    public String customerDetailsSave(String fullBio){
         //Saving customer details to file with every customer created.
        try(BufferedWriter writerWrite = new BufferedWriter(new FileWriter("customers.txt", true))){
            writerWrite.write(customerBio);
            writerWrite.newLine();
            
        } catch (IOException e) {
            outputNext(e.getMessage());
        }
        return customerBio;
    }
    public String customerAcw(String userDetails){
        
        outputNext("Customer "+userBio+" has been succesfully created and is alive in the system!");
        //outputNext("************");
        return userBio;
    
    }
    
    private void sendMoneyTemp(){
        
    }
    /*
    //Sending money between customers
    public void sendMoney(Customer customerOne, Customer customerTwo){
        amountToSend
        //return newCustomerAmount;
    }
    */
    
    
    
    
   
    
}
