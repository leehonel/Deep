package mobilemoneytransfer;

import static mobilemoneytransfer.Customer.customerAmount;
import static mobilemoneytransfer.Customer.keyBoardInput;
import static mobilemoneytransfer.Person.userBio;
import static mobilemoneytransfer.Person.userDob;
import static mobilemoneytransfer.Person.userNatId;
import static mobilemoneytransfer.Person.userPin;
import static mobilemoneytransfer.ServiceProviderAndBank.nameOne;
import static mobilemoneytransfer.ServiceProviderAndBank.nameTwo;
import static mobilemoneytransfer.ServiceProviderAndBank.outputSame;
import static mobilemoneytransfer.ServiceProviderAndBank.outputNext;

public class Agent {
    public static String areaOfOps;     //this refers to the location where the agent's station is situated
    public static float agentAmount;    //this is the virtual amount that is currently in the agent's account.
    public static float depositAmount;  //this is the amount in cash that is handed to the agent by a customer when the latter wants to make a deposit.
    public static float newCustomerAmount;
    
    public static void testOneAgent(){
        outputNext("The Agent subclass is okay!");
    }
    //Creating an agent
    public Agent(){
        outputSame("Enter the Agent's details below\nNames: ");
        nameOne = keyBoardInput.next();
        nameTwo = keyBoardInput.next();
        outputSame("ID number: ");
        userNatId = keyBoardInput.nextInt();
        outputSame("DOB: ");
        userDob = keyBoardInput.next();
        outputSame("PIN: ");
        userPin = keyBoardInput.nextInt();
        outputSame("Area of operations: ");
        areaOfOps = keyBoardInput.next();
        outputSame("Starting float: ");
        agentAmount = keyBoardInput.nextFloat();
        
        userBio = nameOne.toUpperCase()+" "+nameTwo.toUpperCase();
        outputSame("Creating and account for agent "+userBio.toLowerCase()+"...\n"); 
    }  
    
    //Customer making a cash deposit to the agent
    public float cashDeposit(float depositAmount){
        //float newCustomerAmount;
        newCustomerAmount = depositAmount + customerAmount;
        if (agentAmount>0 && agentAmount>depositAmount) {
            agentAmount -= depositAmount;
            outputNext("Transaction ID:CD"+depositAmount+areaOfOps.toUpperCase());
            outputSame("Succesfull deposit of ksh:"+depositAmount+".");
            outputNext(" The float balance is: "+agentAmount);
        } 
        else {
            outputNext("Insufficient amount to facilitate the deposit!");
        }
        return  newCustomerAmount; 
    }   
    
    
}
