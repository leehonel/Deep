package livecodingq2;
//import java.util.Scanner;

public class Users {
    public String userLastName;
    public String userJobLevel;
    public String userDetails;
   
   /* 
    //a method to prompt the user to enter their details and it returns the user's last name and job level. 
    public String enterUserDetails(String userLastName, String userJobLevel){
        //welcomeMessage();
        
        Scanner keyBoardInput = new Scanner(System.in);
        System.out.print("Enter user's last name: ");
        userLastName = keyBoardInput.nextLine();
        System.out.print("Enter user's job level: ");
        userJobLevel = keyBoardInput.nextLine();
        
        userDetails = userLastName + " " + userJobLevel;
        
        return userDetails;
    }
   */
    //A method for users to select the action they would like to perform
    public int chooseAction(int choice, String lastName){
        
        System.out.println("Hello "+lastName+", please select the operation you would like to perform:");
        return choice;
    
    }
    //A constructor to create the current user
    public Users(String lastName, String jobLevel){
       // enterUserDetails(userLastName, userJobLevel);
        userDetails = lastName + " of job level " + jobLevel;
        System.out.println("You are currently logged in as "+ userDetails+".");
        System.out.println("\t\t\t*************");
    
    }
    
    }

