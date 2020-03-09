/*
    This is the second question for the live coding CAT
     You are involved in the development of a university student management system. You have identified the following classes:
        StudentMgtSystem - has the main method
        Student - Abstracts/models a student's details
        Users - (eg. chair of department, academic registrar, direct of school etc.)
     The functionallity you are to implement works as follows:
        The user of the system provides their last name before proceeding to use the system. Then the user is able to enter the details of five students. 
        Upon entering the details, the user can either exit the system or display the details of the five students entered.
        Implement the application providing as much clarity as possible
*/
package livecodingq2;
import java.util.Scanner;

public class StudentManagementSystem {  //
    //public String lastName, jobLevel;
    
    public  void main(String[] args) {
       
        String lastName, jobLevel;
        Scanner keyBoardInput = new Scanner(System.in);
        System.out.print("Enter user last name: ");
        lastName = keyBoardInput.nextLine();
        System.out.print("Enter user job level: ");
        jobLevel = keyBoardInput.nextLine();
        
        Users userOne = new Users(lastName, jobLevel);
        userOne.chooseAction(0, lastName);
        //userOne.enterUserDetails(lastName, jobLevel);
        
        
     
    }

    
    
}
