package mobilemoneytransfer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static mobilemoneytransfer.Customer.customerAmount;
import static mobilemoneytransfer.Customer.keyBoardInput;
import static mobilemoneytransfer.Person.userBio;
import static mobilemoneytransfer.Person.userDob;
import static mobilemoneytransfer.Person.userNatId;
import static mobilemoneytransfer.Person.userPin;
import static mobilemoneytransfer.ServiceProviderAndBank.nameOne;
import static mobilemoneytransfer.ServiceProviderAndBank.nameTwo;
import static mobilemoneytransfer.ServiceProviderAndBank.outputNext;
import static mobilemoneytransfer.ServiceProviderAndBank.outputSame;

public class Agent {
    public static String areaOfOps;     //this refers to the location where the agent's station is situated
    public static float agentAmount;    //this is the virtual amount that is currently in the agent's account.
    public static float depositAmount;  //this is the amount in cash that is handed to the agent by a customer when the latter wants to make a deposit.
    public static float newCustomerAmount;
    public static String agentBio;
    
    public static void testOneAgent(){
        outputNext("The Agent subclass is okay!");
    }
    //creating the agents.txt file
    public static void agentsFile(){
        //creating the agents.txt file
        String columnsTwo = "Agents\n*****";
        try(BufferedWriter writerWrite = new BufferedWriter(new FileWriter("Agents.txt"))){  //this overwrites the existing customer.txt file if there is one that already exists.
            writerWrite.write(columnsTwo);
            writerWrite.newLine();
            
        } catch (IOException e) {
            outputNext(e.getMessage());
        }
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
        userPin = keyBoardInput.next();
        outputSame("Area of operations: ");
        areaOfOps = keyBoardInput.next();
        outputSame("Starting float: ");
        agentAmount = keyBoardInput.nextFloat();
        
        userBio = nameOne.toUpperCase()+" "+nameTwo.toUpperCase();
        agentBio = nameOne.toUpperCase()+"      "+nameTwo.toUpperCase()+"       "+userNatId+"       "+userDob+"     "+areaOfOps;
        outputSame("Creating and account for agent "+userBio.toLowerCase()+"...\n"); 
    }  
    
    public String agentDetailsSave(String fullBio){
         //Saving customer details to file with every customer created.
        try(BufferedWriter writerWrite = new BufferedWriter(new FileWriter("Agents.txt", true))){
            writerWrite.write(agentBio);
            writerWrite.newLine();
            
        } catch (IOException e) {
            outputNext(e.getMessage());
        }
        return agentBio;
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
