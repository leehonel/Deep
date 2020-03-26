//Check out README.txt and Mobile Money Transter.doc files in project folder for group info.
//This class has the main method and thus makes up the entry point into the program. 

package mobilemoneytransfer;
import static mobilemoneytransfer.Person.userBio;
import java.util.Scanner;
import static mobilemoneytransfer.Agent.agentBio;
import static mobilemoneytransfer.Agent.agentsFile;
import static mobilemoneytransfer.Agent.newCustomerAmount;
//import static mobilemoneytransfer.Customer.customerAcw;
import static mobilemoneytransfer.Customer.customerAmount;
import static mobilemoneytransfer.Customer.customerBio;
import static mobilemoneytransfer.Customer.customersFile;
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
       /*
        Person.testOnePerson();
        Agent.testOneAgent();
        Customer.testOneCustomer();
       */
        //outputSame("How many customers would you like to create?");

/*        
1. Customer Creation
        - creation of one+ customers in order to facilitate transactions
*/
        customersFile();    //creating the customers.txt file
        Customer customerOne = new Customer();  //creating an account for the first customer
        customerOne.customerDetailsSave(customerBio);   //saving the customer's details in the customers.txt file
        customerOne.customerAcw(userBio);
        
        Customer customerTwo = new Customer();  //creating and account for the second customer
        customerTwo.customerDetailsSave(userBio);
        customerTwo.customerAcw(userBio);
        
        
        outputNext("\n********\n");
/*
2. Agent Creation
        - creation of the first agent
*/
        agentsFile();   //creating the agents.txt file
        Agent agentOne = new Agent();   //creating an account for the agent
        agentOne.agentDetailsSave(agentBio);
        //customerAcw();

/*        
Customer makes deposit
        - debit the customer's account and credit the agent's.
        - agent should be able to validate the customer's details before the transaction takes place. 
*/
      //the first customer making a deposit
        outputNext("\nCash Deposit\n*******");
        outputSame("Enter amount to deposit: ");
        amountDepo = keyBoardInput.nextFloat();
        agentOne.cashDeposit(amountDepo);
        customerAmount = newCustomerAmount;
        
/*
Customer sends to another customer
        - the sender's pin number should be validated before the transaction takes place.
        - credit the sender's account and credit the recipient's. 
*/
      
        
/*
Customer Withdraws from the agent
        - the customer's pin should be validated
        - the agent should have enough balance to facilitate the transaction.
        - credit the customer's account and debit the agent's.
*/   

/*
Create UI to match!
#Viva the one percent everyday.
*/
        
        
    
        
    }
}
