//Check out README.txt and Mobile Money Transter.doc files in project folder for group info.
//This class has the main method and thus makes up the entry point into the program. 

package mobilemoneytransfer;
import static mobilemoneytransfer.Person.userBio;
import java.util.Scanner;
import static mobilemoneytransfer.Agent.newCustomerAmount;
import static mobilemoneytransfer.Person.customerAcw;
import static mobilemoneytransfer.Customer.customerAmount;
//import static mobilemoneytransfer.Customer.customerReciept;
//import static mobilemoneytransfer.Agent.depositAmount;

public class ServiceProviderAndBank {
    public static Scanner keyBoardInput = new Scanner(System.in);
    
    public static String nameOne, nameTwo;  
    public static float amountDepo;     //this is the amount to be deposited
    
    public static void outputSame(String text){
        //This method leaves the program on the same line as the text its printed
        System.out.print(text);
    }
    
    public static void outputNext(String text){
        /*
            This method takes care of the strugle of typing System.out.print(); every time you want to generate an output in your program.
            This method jumps the program to the next line after printing its text.
        */
        System.out.println(text);
        
    }
    
    public static void main(String[] args) {
        outputNext("Welcome to the OOP emoney transfer system.");
        Person.testOnePerson();
        Agent.testOneAgent();
        Customer.testOneCustomer();
        
        Customer customerTwo = new Customer();
        customerAcw();
        
        outputNext("\n********\n");
        
        Agent agentOne = new Agent();
        customerAcw();
        
        outputNext("\nCash Deposit\n*******");
        outputSame("Enter amount to deposit: ");
        amountDepo = keyBoardInput.nextFloat();
        agentOne.cashDeposit(amountDepo);
        customerAmount = newCustomerAmount;
        
        customerTwo.customerReciept();
        
        
        
    
        
    }
    
    public static String registerUser(){
        return userBio;
    }
    
    
    
}
