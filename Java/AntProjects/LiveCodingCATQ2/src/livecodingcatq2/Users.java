package livecodingcatq2;
import java.util.Scanner;


public class Users {
    public String userLastName;
    Scanner keyBoardInput = new Scanner(System.in); 
   
    static void helloWorld(){
        System.out.println("Test one");
        //return world;
    }
    
    //A constructor that creates the first user given the user's first name
    public Users(String userLastName){
        //Scanner keyBoardInput = new Scanner(System.in);
        //helloWorld();
        System.out.print("Enter user last name: "); 
        userLastName = keyBoardInput.nextLine();
        
        //return userLastName;
    }
    
    
    
}
