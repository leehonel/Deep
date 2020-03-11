//Take Two
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

package livecodingcatq2;
import java.util.Scanner;

import com.sun.java.accessibility.util.EventID;
import static livecodingcatq2.Users.helloWorld; //an import to allow for access to the static method helloWorld in Users 




public class StudentMgtSystem {
    

    public static void main(String[] args) {
        Scanner keyBoardInput = new Scanner(System.in);
       // Scanner keyBoardInput = new Scanner(System.in);
       helloWorld();
       System.out.println("Hello, welcome to the Student Management System.");
       Users userOne = new Users("one");
       //System.out.print("Enter Student Index: ");
      // Students studentOne = new Students("one");         //instantiating the constructor at this point allows for creation of only one object
       
       
        for (int i = 0; i < 5; i++) {
            Students studentOne = new Students("one");      //while instantiating the constructor at this point limits the use of the studentOne object outside of this scope.
            /*
            for (int j = 0; j < 2; j++) {
                studentOne.studentList();
            }
            */
            
            
            /*
            String nextAction;
            System.out.print("\n\nHow would you like to proceed? You can either 'output' the details you entered or 'exit'");
            nextAction = keyBoardInput.nextLine();
            
            if (nextAction == "output") {
                studentOne.studentList();
                
            } 
            else{
            }
            */
            //studentOne.studentList();
            //System.out.println("\n\n"+student);
        }
        
        
       
       
       
       
        
        

    
    }
    
}
